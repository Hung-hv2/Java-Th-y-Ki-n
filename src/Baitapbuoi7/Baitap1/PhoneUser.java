package Baitapbuoi7.Baitap1;

public class PhoneUser {
    String name;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
    void show(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "PhoneUser{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
