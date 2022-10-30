package Baitap2;

public class KhoiA extends ThiSinh {
    public String Toan;
    public String Ly;
    public String Hoa;
    public KhoiA(String sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "Toan='" + Toan + '\'' +
                ", Ly='" + Ly + '\'' +
                ", Hoa='" + Hoa + '\'' +
                ", Sobaodanh='" + Sobaodanh + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Mucuutien=" + Mucuutien +
                '}';
    }
}
