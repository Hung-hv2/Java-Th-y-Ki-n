package Baitapbuoi7.Baitap2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlyNews {

    static ArrayList<News> NewList = new ArrayList<>();
    static void insertNews() {
        News news = new News();
        news.setTitle(news.title);
        news.setPublishDate(news.PublishDate);
        news.setAuthor(news.Author);
        news.setContent(news.Content);
        NewList.add(news);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap title");
        news.title = sc.nextLine();
        System.out.println("Nhap PublistDate");
        news.PublishDate = sc.nextLine();
        System.out.println("Nhap Author");
        news.Author = sc.nextLine();
        System.out.println("Nhap Content");
        news.Content = sc.nextLine();
        System.out.println("Nhap 3 danh gia");
        for (int i = 0; i < news.RateList.length; i++) {
            System.out.println("danh gia" + i);
            news.RateList[i] = sc.nextInt();
        }
    }
    static void Viewlistnew() {
        for (int i = 0; i < NewList.size(); i++) {
            NewList.get(i).display();
        }
    }
    static void averagerate() {
        for (int i = 0; i < NewList.size(); i++) {
            NewList.get(i).caculate();
            NewList.get(i).display();
        }
    }
}
