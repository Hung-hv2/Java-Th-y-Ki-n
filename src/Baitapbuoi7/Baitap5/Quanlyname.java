package Baitapbuoi7.Baitap5;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Quanlyname {
    static ArrayList<nameStudent> nameList = new ArrayList<>(100);
    static void insertStudent() {
        nameStudent name = new nameStudent();
        name.setFullName(name.FullName);
        name.setDateofBirth(name.DateofBirth);
        name.setNative(name.Native);
        name.setClass(name.Clas);
        name.setPhoneNo(name.PhoneNo);
        name.setMobile(name.Mobile);
        nameList.add(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap full name");
        name.FullName = sc.nextLine();
        System.out.println("Nhap Date Of Birth");
        name.DateofBirth = sc.nextLine();
        System.out.println("Nhap Native");
        name.Native = sc.nextLine();
        System.out.println("Nhap Class");
        name.Clas = sc.nextLine();
        System.out.println("Nhap PhoneNo");
        name.PhoneNo = sc.nextLine();
        System.out.println("Nhap Mobile");
        name.Mobile = sc.nextInt();
//        for (int n = 0; n < nameList.size(); n++) {
//
//        }
    }
    static void showStudent() {
        for (int i = 0; i < nameList.size(); i++) {
            nameList.get(i).display();
        }
    }
    void searchStudent(String Fullname) {
        for (int i = 0; i < nameList.size(); i++) {
            if (Fullname.equals(nameList.get(i))){

            }
        }
    }
}