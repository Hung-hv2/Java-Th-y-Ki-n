package Baitap8;

import java.util.Scanner;

public class Bienlai extends Khachhang {
    private int sodiencu;
    private int sodienmoi;
    private double sotienphaitra;

    // Hàm khởi tạo không đối số
    public Bienlai() {

    }
    // Hàm khởi tao có đối số
    public Bienlai(int sodiencu, int sodienmoi, int sotienphaitra, Khachhang khachhang) {
        this.sodiencu = sodiencu;
        this.sodienmoi = sodienmoi;
        this.sotienphaitra = sotienphaitra;
    }

    //Ham nhập thông tin biên lai
    public void Nhapthongtinbienlai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện cũ: ");
        int sodiencu = scanner.nextInt();
        System.out.println("Nhập số điện mới: ");
        int sodienmoi = scanner.nextInt();
        double sotienphaitra = (sodienmoi - sodiencu) * 750;
    }

    // Hàm hiển thị thông tin biên lai
    public void Hienthithongtinbienlai() {
        System.out.println("Số điện cũ: " + sodiencu);
        System.out.println("Số điện mới: " + sodienmoi);
        System.out.println("Số tiền điện: " + sotienphaitra);
    }

    @Override
    public String toString() {
        return "Bienlai{" +
                "sodiencu=" + sodiencu +
                ", sodienmoi=" + sodienmoi +
                ", sotienphaitra=" + sotienphaitra +
                ", tenchuho='" + tenchuho + '\'' +
                ", sonha=" + sonha +
                ", masocongto=" + masocongto +
                '}';
    }
}
