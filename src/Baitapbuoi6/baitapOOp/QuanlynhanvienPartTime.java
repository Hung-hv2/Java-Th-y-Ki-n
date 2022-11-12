package Baitapbuoi6.baitapOOp;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlynhanvienPartTime {
    public static final long LuongPartTime = 100000;
    Scanner scanner = new Scanner(System.in);
    ArrayList<NhanvienParttime> ListnhanvienParttimes = new ArrayList<>();
    public ArrayList<NhanvienParttime> getListnhanvienParttimes() {
        return ListnhanvienParttimes;
    }
    public void setListnhanvienParttimes(ArrayList<NhanvienParttime> listnhanvienParttimes) {
        this.ListnhanvienParttimes = listnhanvienParttimes;
    }
    public void HienthinhanvienPartTime() {
        System.out.println("---Danh sách nhân viên PartTime là: ");
        for (int i = 0; i < getListnhanvienParttimes().size(); i++) {
            ListnhanvienParttimes.get(i).HienthiPartTime();
        }
    }
    public void TinhluongPartTime() {
        double SumPartTime = 0;
        for (int i = 0; i < ListnhanvienParttimes.size(); i++) {
            SumPartTime = ListnhanvienParttimes.get(i).getSogiolamviec() * LuongPartTime;
        }
        System.out.println("Tổng tiền lương PartTime là: " + SumPartTime);
    }
    public void TimKiemNhanVien() {
        boolean isFound = false;
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String ten = scanner.nextLine();
        for (int i = 0; i < ListnhanvienParttimes.size(); i++) {
            if (ListnhanvienParttimes.get(i).getTen().equals(ten)) {
                ListnhanvienParttimes.get(i).HienthiPartTime();
            }
        }
        if(!isFound) {
            System.out.println("Không tìm thấy nhân viên: ");
        }
    }
    public void RunPartTime() {
        int choose;
        do {
            System.out.println("------Employee PartTime------");
            System.out.println("1.Nhập thông tin nhân viên PartTime");
            System.out.println("2.Hiển thị nhân viên PartTime");
            System.out.println("3.Tiền lương nhân viên PartTime");
            System.out.println("4.Tìm kiếm nhân viên PartTime:");
            System.out.println("5.Thoát chương trình");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng nhân viên PartTime: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin nhân viên PartTime" +(i+1));
                        System.out.println("Nhập tên nhân viên: ");
                        String ten = scanner.nextLine();
                        System.out.println("Nhập số giờ làm việc: ");
                        int sogiolamviec = scanner.nextInt();
                        ListnhanvienParttimes.add(new NhanvienParttime(ten, sogiolamviec));
                    }
                    break;
                case 2:
                    HienthinhanvienPartTime();
                    break;
                case 3:
                    TinhluongPartTime();
                    break;
                case 4:
                    TimKiemNhanVien();
                    break;
                case 5 :
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
        while (choose!=5);
    }
}
