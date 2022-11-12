package Baitapbuoi6.baitapOOp;

import java.util.Scanner;

//Công ty có hai loại nhân viên: nhân viên toàn thời gian và nhân viên thời vụ.
//– Nhân viên toàn thời gian là lính sẽ hưởng lương 10 củ một tháng. Nhân viên toàn thời gian là sếp sẽ hưởng lương 20 củ một tháng.
//– Nhân viên toàn thời gian nếu làm thêm ngày nào thì sẽ được cộng thêm 800k mỗi ngày, bất kể chức vụ.
//– Nhân viên thời vụ cứ làm mỗi giờ được 100k, không phân biệt chức vụ gì cả. Làm nhiều thì hưởng nhiều.
//
//Ứng dụng sẽ cho phép người dùng
//	- nhập vào số lượng nhân viên.
//		Sau đó với từng nhân viên,
//		người dùng phải nhập vào
//			tên nhân viên,
//			loại nhân viên toàn thời gian hay bán thời gian,
//			nhân viên toàn thời gian thì là nhân viên lính hay nhân viên sếp,
//			có làm thêm ngày nào không,
//			nhân viên thời vụ thì làm được mấy giờ.
//	- Hiển thị toàn bộ thông tin của nhân viên bao gồm cả lương mà nhân viên
//		đó nhận được ứng với các thông tin ở trên
//
//	- Tìm danh sách nhân viên với ký tự tương đối, ví dụ
//		nguyen Van A: chỉ cần nhập vào a, hoặc VAN, hoặc NGUY
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("---CHọn chức năng---");
            System.out.println("1.Quản lý nhân viên FullTime");
            System.out.println("2.Quản lý nhân viên FartTime");
            System.out.println("3.Thoát chương trình");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    QuanlynhanvienFullTime quanlynhanvienFullTime = new QuanlynhanvienFullTime();
                    quanlynhanvienFullTime.RunFullTime();
                case 2:
                    QuanlynhanvienPartTime quanlynhanvienPartTime = new QuanlynhanvienPartTime();
                    quanlynhanvienPartTime.RunPartTime();
                case 3:
                    System.out.println("Thoát chương trình");
                    check = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
}
