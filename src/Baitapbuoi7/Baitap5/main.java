package Baitapbuoi7.Baitap5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanlyname quanlyname = new Quanlyname();
        boolean add = true;
        do {
            System.out.println("------Menu------");
            System.out.println("1. Insert new student");
            System.out.println("2. View list of students");
            System.out.println("3. Search students");
            System.out.println("4. Exit");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    quanlyname.insertStudent();
                    break;
                case 2:
                    quanlyname.showStudent();
                    break;
            }
        }while (add);
    }
}
