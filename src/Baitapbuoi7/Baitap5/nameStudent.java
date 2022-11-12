package Baitapbuoi7.Baitap5;

public class nameStudent implements nameIStudentcontains {
    String FullName,Native,PhoneNo;
    int ID, Mobile;
    String Clas,DateofBirth;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getNative() {
        return Native;
    }

    public void setNative(String aNative) {
        Native = aNative;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMobile() {
        return Mobile;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }

    public String getClas() {
        return Clas;
    }

    public void setClass(String aClass) {
        Clas = Clas;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    @Override
    public void display() {
        System.out.println("ID la: " + ID);
        System.out.println("Full name la: " + FullName);
        System.out.println("DateofBirth la: " + DateofBirth);
        System.out.println("Native la: " + Native);
        System.out.println("Class la: " + Clas);
        System.out.println("PhoneNo la: " + PhoneNo);
        System.out.println("Mobile la: " + Mobile);
    }
}
