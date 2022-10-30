package Baitap8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quanlyhogiadinh {
    private ArrayList<Bienlai> danhsach ;
    public Quanlyhogiadinh () {
        danhsach = new ArrayList<Bienlai>(100);
    }
    public void thembienlai (Bienlai bienlai) {
        danhsach.add(bienlai);
    }
    public void Nhapdanhsach () {
        Bienlai bienlai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vào số lượng biên lai: ");
        int soluongbienlai = scanner.nextInt();
        System.out.println("Nhập vào danh sách biên lai: ");
        int danhsachbienlai = scanner.nextInt();
        for ( int i = 0; i < soluongbienlai; i++) {
            System.out.println("Số biên lai phải thu là: " + (i +1));
            bienlai = new Bienlai();
            bienlai.Nhapthongtinbienlai();
            thembienlai(bienlai);
        }
    }

    // Hàm hiển thị danh sách hộ gia đình
    public void hienthidanhsachhogiadinh () {
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println("Biên lai cần phải thu là" + (i +1));
            danhsach.get(i).Hienthithongtinbienlai();
            System.out.println();
        }
    }

}
