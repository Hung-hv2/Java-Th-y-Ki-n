package Baitapbuoi6.baitapOOp;

public class NhanvienParttime extends Nhanvien {
    private int sogiolamviec;
    public NhanvienParttime(String ten, int luong) {
        super(ten, luong);
        this.sogiolamviec = sogiolamviec;
    }

    public int getSogiolamviec() {
        return sogiolamviec;
    }

    public void setSogiolamviec(int sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    public void HienthiPartTime() {
        System.out.println("Nhân viên PartTime { " + "Tên = " + ten +  ", Số giờ làm việc = " + sogiolamviec +  ", Lương PartTime = " + luong + "} ");
    }
}
