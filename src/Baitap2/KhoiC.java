package Baitap2;

public class KhoiC extends ThiSinh {
    public String Van;
    public String Su;
    public String Dia;
    public KhoiC(String sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "Van='" + Van + '\'' +
                ", Su='" + Su + '\'' +
                ", Dia='" + Dia + '\'' +
                ", Sobaodanh='" + Sobaodanh + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Diachi='" + Diachi + '\'' +
                ", Mucuutien=" + Mucuutien +
                '}';
    }
}
