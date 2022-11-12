package Buoi9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = getInput();
        int[] arr = new int[n];
        System.out.println("Nhập số lượng phần tử");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Các giá trị của mảng là:" +(i + 1));
            int data = getInput();
            if (data == 100) {
                System.out.println("Các giá trị nhập vào của mảng là:");
                for (int j = 0; j < i; j++) {
                    System.out.println(arr[j]);
                }
                throw new Exception("Bạn đã nhập vào 100");
            }
            arr[i] = data;
        }
    }
    public static int getInput() {
        boolean invaliData = true;
        int n = 0;
        do {
            try {
                n = new Scanner(System.in).nextInt();
                invaliData = false;
            }catch (InputMismatchException e) {
                System.out.println("Dữ liệu nhập vào không hợp lệ, hãy nhập lại dữ liệu kiểu số");
            }
        }while (invaliData);
        return n;

    }
}
