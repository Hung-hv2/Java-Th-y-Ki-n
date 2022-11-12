package Buoi9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
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
