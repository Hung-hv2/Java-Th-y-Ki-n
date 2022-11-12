package Baitapbuoi7.Baitap1;

public abstract class Phone {
    // Khai báo các phương thức trìu tượng(abstract)
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name, String newphone);
    abstract void searchPhone(String name);
    abstract void sort();
}
