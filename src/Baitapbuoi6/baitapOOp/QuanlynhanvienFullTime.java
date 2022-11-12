package Baitapbuoi6.baitapOOp;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlynhanvienFullTime {
    public static final int Nhanvien = 1;
    public static final int Sep = 2;
    public static final long Nhanvienluong = 10000000;
    public static final long Sepluong = 20000000;
    public static final long Luonglamthem = 800000;
    Scanner scanner = new Scanner(System.in);
    ArrayList<NhanvienFulltime> ListnhanvienFulltimes = new ArrayList<>();
    public ArrayList<NhanvienFulltime> getListnhanvienFulltimes() {
        return ListnhanvienFulltimes;
    }
    public void setListnhanvienFulltimes(ArrayList<NhanvienFulltime> listnhanvienFulltimes) {
        this.ListnhanvienFulltimes = listnhanvienFulltimes;
    }
    public void HienthinhanvienFullTime() {
        System.out.println("---Danh sách nhân viên FullTime là: ");
        for (int i = 0; i < getListnhanvienFulltimes().size(); i++) {
            ListnhanvienFulltimes.get(i).HienthiFullTime();
        }
    }
    public void TimKiemNhanVien() {
        boolean isFound = false;
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String ten = scanner.nextLine();
        for (int i = 0; i < ListnhanvienFulltimes.size();i++) {
            if (ListnhanvienFulltimes.get(i).getTen().equals(ten)) {
                ListnhanvienFulltimes.get(i).HienthiFullTime();
            }
        }
        if(!isFound) {
            System.out.println("Không tìm thấy nhân viên: ");
        }
    }



    public void TinhluongFullTime() {
        int choose;
        do {
            System.out.println("----- Chọn Menu -----");
            System.out.println("1.Là Nhân viên");
            System.out.println("2.Là sếp");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    double SumNhanvien = 0;
                    for (int i = 0; i < ListnhanvienFulltimes.size(); i++) {
                        SumNhanvien += ListnhanvienFulltimes.get(i).getNgaylamthem() + (Nhanvienluong);
                        System.out.println("Lương Nhân viên FullTime là:");
                    }
                    break;
                case 2:
                    double SumSep = 0;
                    for (int i = 0; i < ListnhanvienFulltimes.size(); i++) {
                        SumSep += ListnhanvienFulltimes.get(i).getNgaylamthem() + Sepluong;
                        System.out.println("Lương Sếp FullTime là:");
                    }
                    break;
                case 3:
                    System.out.println("Thoát khỏi chương trình");
                    break;
            }
//        if (loaichucvu == Nhanvien) {
//            luong = Nhanvienluong + ngaylamthem * Luonglamthem;
//            System.out.println("Lương FullTime của nhân viên: " + luong);
//        } else if (loaichucvu == Sep) {
//            luong = Sepluong + ngaylamthem *Luonglamthem ;
//            System.out.println("Lương FUllTime của sếp là: " +luong);
//        }
        }while (choose!=3);
    }
    public void RunFullTime() {
        int choose;
        do {
            System.out.println("------Employee FullTime------");
            System.out.println("1.Nhập thông tin nhân viên FullTime");
            System.out.println("2.Hiển thị nhân viên FullTime");
            System.out.println("3.Tiền lương nhân viên FullTime");
            System.out.println("4.Tìm kiếm nhân viên FullTime:");
            System.out.println("5.Thoát chương trình");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng nhân viên FullTime: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin nhân viên FullTime" +(i+1));
                        System.out.println("Nhập tên nhân viên: ");
                        String ten = scanner.nextLine();
                        System.out.println("Nhập số giờ làm việc: ");
                        int sogiolamviec = scanner.nextInt();
                        ListnhanvienFulltimes.add(new NhanvienFulltime(ten,sogiolamviec));
                    }
                    break;
                case 2:
                    HienthinhanvienFullTime();
                    break;
                case 3:
                    TinhluongFullTime();
                    break;
                case 4:
                    TimKiemNhanVien();
                case 5:
                    System.out.println("Thoát Chương Trình: ");
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (choose!=5);
    }
}
