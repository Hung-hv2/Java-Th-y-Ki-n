package Baitap2;

public class KhoiB extends ThiSinh {
    public String Toan;
    public String Hoa;
    public String Sinh;
    public KhoiB(String sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "Toan='" + Toan + '\'' +
                ", Hoa='" + Hoa + '\'' +
                ", Sinh='" + Sinh + '\'' +
                ", Sobaodanh='" + Sobaodanh + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Mucuutien=" + Mucuutien +
                '}';
    }
}
