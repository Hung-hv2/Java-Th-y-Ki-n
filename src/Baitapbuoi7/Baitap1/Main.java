package Baitapbuoi7.Baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean flag = true;
        do{
            System.out.println("------Menu-------");
            System.out.println("1. insert phone");
            System.out.println("2. show ");
            System.out.println("3. Remove name");
            System.out.println("4. update Phone");
            System.out.println("5. search Phone");
            System.out.println("6. sort Phone");


            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 1:
                    System.out.println("Nhap name");
                    String nameInsert = sc.nextLine();
                    System.out.println("Nhap phone");
                    String phoneInsert = sc.nextLine();
                    phoneBook.insertPhone(nameInsert,phoneInsert);

                    break;

                case 2:
                    phoneBook.showPhone();
                    break;

                case 3:
                    System.out.println("nhap ten can xoa");
                    String nameDelete = sc.nextLine();
                    phoneBook.removePhone(nameDelete);
                    break;
                case 4:
                    System.out.println("update Phone");
                    String updateName = sc.nextLine();
                    String updatePhone = sc.nextLine();
                    phoneBook.updatePhone(updateName,updatePhone);
                    break;
                case 5:
                    System.out.println("Nhap ten can tim");
                    String searchName = sc.nextLine();
                    phoneBook.searchPhone(searchName);
                    break;
                case 6:
                    System.out.println("Ten sau khi sắp xếp");
                    phoneBook.sort();
            }

        }while (flag);


    }
}
