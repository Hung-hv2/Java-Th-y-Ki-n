package Buoi6;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        // Tìm hiển về regex
//        StringBuffer name = new StringBuffer("abc");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào chuỗi bạn muốn kiểm tra:");
//        String input = scanner.nextLine();
//        System.out.println(name.reverse().toString().equals(input));

        //B2:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi vào bàn phím:");
//        String input = scanner.nextLine();
//        String reverse = new StringBuffer(input).reverse().toString();
//        System.out.println("Trước: "+input);
//        System.out.println("Sau: "+reverse);

        //B3: Kiểm tra kí tự có thuộc chuỗi không
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi kí tự: ");
//        String input = scanner.nextLine();
//        System.out.println(input.contains("abc"));
//        System.out.println(input.contains("123"));

        // Bai4: Kiềm tra chuỗi nhập vào có kí tự số không
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự: ");
        String input = scanner.nextLine();
        boolean sokitu = true;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                sokitu = false;
                break;
            }
        }
        if (sokitu) {
            System.out.println("không chưa kí tự số:");
        } else {
            System.out.println("chứa kí tự số:");
        }

    }
}
