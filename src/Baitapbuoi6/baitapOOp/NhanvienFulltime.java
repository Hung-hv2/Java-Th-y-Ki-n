package Baitapbuoi6.baitapOOp;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanvienFulltime extends Nhanvien {
    public int loaichucvu;
    public int ngaylamthem;
    public static final int Nhanvien = 1;
    public static final int Sep = 2;
    public static final long Nhanvienluong = 10000000;
    public static final long Sepluong = 20000000;
    public static final long Luonglamthem = 800000;

    public NhanvienFulltime(String loaichucvu, int ngaylamthem) {
        this.loaichucvu = Integer.parseInt(loaichucvu);
        this.ngaylamthem = ngaylamthem;
    }

    public NhanvienFulltime(String ten, int luong, int loaichucvu, int ngaylamthem) {
        super(ten, luong);
        this.loaichucvu = loaichucvu;
        this.ngaylamthem = ngaylamthem;
    }

    public int getLoaichucvu() {
        return loaichucvu;
    }

    public void setLoaichucvu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }

    public int getNgaylamthem() {
        return ngaylamthem;
    }

    public void setNgaylamthem(int ngaylamthem) {
        this.ngaylamthem = ngaylamthem;
    }
    public void HienthiFullTime() {
        System.out.println("Nhân viên FullTime là: (" + "Tên = " + ten +
                "Loại chức vụ = " + loaichucvu + "Lương = " + luong + "Ngày làm thêm: " + ngaylamthem + "}" );
    }
}
