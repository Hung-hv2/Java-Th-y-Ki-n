package Baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlyThisinh {
    List<ThiSinh> thiSinhList;

    public QuanlyThisinh() {
        this.thiSinhList = new ArrayList<>();
    }

    public void Themthisinh(ThiSinh thiSinh) {
        this.thiSinhList.add(thiSinh);
    }

    public void Hienthithongtin() {
        this.thiSinhList.forEach(thiSinh -> System.out.println(thiSinh.toString()));
    }

    public ThiSinh Timkiemsobaodanh(String Sobaodanh) {
        return this.thiSinhList.stream().filter(thiSinh -> thiSinh.getSobaodanh()
                .equals(Sobaodanh)).findFirst().orElse(null);
    }
    Scanner scanner = new Scanner(System.in);
    public static ThiSinh Taothisinh(Scanner scanner, String cate) {
        System.out.print("nhập số báo danh : ");
        String Sobaodanh = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String Hoten = scanner.nextLine();
        System.out.print("Nhập đại chỉ: ");
        String Diachi = scanner.nextLine();
        System.out.print("nhập mức độ ưu tiên: ");
        int Mucuutien = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new KhoiA(Sobaodanh, Hoten, Diachi, Mucuutien);
        } else if (cate.equals("b")) {
            return new KhoiB(Sobaodanh, Hoten, Diachi, Mucuutien);
        } else {
            return new KhoiC(Sobaodanh, Hoten, Diachi, Mucuutien);
        }
    }
}
