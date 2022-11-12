package Baitapbuoi6.baitapOOp;

public class Nhanvien {
    public String ten;
    public long luong;
    public Nhanvien() {
    }
    public Nhanvien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public long getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    @Override
    public String toString() {
        return "Nhanvien{" +
                "ten='" + ten + '\'' +
                ", luong=" + luong +
                '}';
    }
}
