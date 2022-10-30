package Baitap2;

import java.util.Scanner;

//Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C.
// Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
//Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
// Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
// Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
//Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.
// Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
//Thêm mới thí sinh.
//Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//Tìm kiếm theo số báo danh.
//Thoát khỏi chương trình.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanlyThisinh quanlyThisinh = new QuanlyThisinh();
        while(true) {
            System.out.println("Quản lý các thi sinh tham gia: ");
            System.out.println("Nhập 1: Thêm mới thí sinh: ");
            System.out.println("Nhập 2: Hiển thị thông tin thí sinh và khối thi: ");
            System.out.println("Nhập 3: Tìm kiếm thí sinh theo số báo danh: ");
            System.out.println("Nhập 4: Thoát chương trình");
            String khoithi = scanner.nextLine();
            switch (khoithi) {
                case "1": {
                    System.out.println("Nhập a: Thí sinh khối A: ");
                    System.out.println("Nhập b: Thí sinh khối B: ");
                    System.out.println("Nhập c: Thí sinh khối C: ");
                    String Khoi = scanner.nextLine();
                    switch (Khoi) {
                        case "a": {
                            quanlyThisinh.Themthisinh(QuanlyThisinh.Taothisinh(scanner, "a"));
                            break;
                        }
                        case "b": {
                            quanlyThisinh.Themthisinh(QuanlyThisinh.Taothisinh(scanner, "b"));
                            break;
                        }
                        case "c": {
                            quanlyThisinh.Themthisinh(QuanlyThisinh.Taothisinh(scanner, "c"));
                            break;
                        }
                        default: {
                            System.out.println("Nhập sai thông tin: ");
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    quanlyThisinh.Hienthithongtin();
                    break;
                }
                case "3": {
                    System.out.println("Nhập số báo danh: ");
                    String Sobaodanh = scanner.nextLine();
                    ThiSinh thiSinh1 = quanlyThisinh.Timkiemsobaodanh(Sobaodanh);
                    if (thiSinh1 == null) {
                        System.out.println("Không Tìm thấy số báo danh: ");
                    } else {
                        System.out.println(thiSinh1.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default: {
                    System.out.println("Không có thông tin: ");
                }
            }
        }
    }
}
