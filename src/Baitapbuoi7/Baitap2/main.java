package Baitapbuoi7.Baitap2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanlyNews quanlyNews = new QuanlyNews();
        boolean flag = true;
        do {
            System.out.println("------Menu-------");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    quanlyNews.insertNews();
                    break;
                case 2:
                    quanlyNews.Viewlistnew();
                    break;
                case 3:
                    quanlyNews.averagerate();
                    break;
                case 4:
                    return;
            }
        } while (flag);
    }
}
