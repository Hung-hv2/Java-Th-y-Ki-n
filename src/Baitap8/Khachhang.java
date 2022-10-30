package Baitap8;

import java.util.Scanner;

public class Khachhang {
    protected String tenchuho;
    protected int sonha;
    protected int masocongto;

    public Khachhang(String tenchuho, int sonha, int masocongto) {
        this.tenchuho = tenchuho;
        this.sonha = sonha;
        this.masocongto = masocongto;
    }
    public Khachhang () {

    }
    public void Themkhachang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên chủ hộ: ");
        String tenchuho = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        int sonha = scanner.nextInt();
        System.out.println("Nhập mã số công tơ: ");
        int masocongto = scanner.nextInt();
    }
    public void Hienthithongtinkhachhang() {
        System.out.println("Tên chủ hộ: " + tenchuho);
        System.out.println("Số nhà chủ hộ: " + sonha);
        System.out.println("Tên chủ hộ: " + masocongto);
    }

    @Override
    public String toString() {
        return "Khachhang{" +
                "tenchuho='" + tenchuho + '\'' +
                ", sonha=" + sonha +
                ", masocongto=" + masocongto +
                '}';
    }
}
