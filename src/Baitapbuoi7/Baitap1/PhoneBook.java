package Baitapbuoi7.Baitap1;

public class PhoneBook extends Phone {
    // tạo mảng phoneList
    PhoneUser[] phoneList;

    //số lượng các số điện thoại trong chương trình
    private int currentNumberPhone;
    int length;
    public PhoneBook(){
        phoneList = new PhoneUser[100];
        length=0;
    }
    @Override
    void insertPhone(String name, String phone) {
        PhoneUser phoneUser = new PhoneUser();
        phoneUser.setName(name);
        phoneUser.setPhone(phone);
        phoneList[length] = phoneUser;
        length++;
        if(length == 100) {
            System.out.println("Phone list full");
            return;
        }
        boolean notFound = false;
        for (int i = 0; i < length; i++) {
            if(this.phoneList[i].getName().equals(name)) {
                if(!phoneList[i].getPhone().contains(phone)) {
                    notFound = true;
                    StringBuffer newPhone = new StringBuffer(phoneList[i].getPhone());
                    newPhone.append(" : ").append(phone);
//                    phoneList[i].setPhone();
                }
            }

        }
    }
    void showPhone() {
        for (int i = 0; i < length; i++) {
//            System.out.println(phoneList.toString());
            phoneList[i].show();

        }
    }

    @Override
    void removePhone(String name) {
        for (int i = 0; i < length; i++) {
            if (name.equals(phoneList[i].getName())){ // lay index

                if (i == length-1) {
                    length--;
                    phoneList = null;
                }else {
                    // dich phan tu
                    for (int j = i; j < length; j++) {
                        phoneList[j]  = phoneList[j+1];
                    }
                    length--;
                }

            }
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i = 0; i < length; i++) {
            if(name.equals(phoneList[i].getName())) {
                phoneList[i].setPhone(newphone);
                break;
            }

        }
    }

    @Override
    void searchPhone(String name) {
        for (int i = 0; i < length; i++) {
            if (name.equals(phoneList[i].getName())) {
                System.out.println("Ten can tim " + name);
                break;
            }
        }
    }

    @Override
    void sort() {
        PhoneUser[] arrCopy = phoneList.clone();
         for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                // sắp sếp theo A(65) -> B (66)
                String name1 = arrCopy[i].getName();
                String name2 = arrCopy[j].getName();

                // Trừ đi phải dương > 0
                if (name1.compareTo(name2) > 0) {
                    PhoneUser term = arrCopy[i];
                    arrCopy[i] = arrCopy[j];
                    arrCopy[j] = term;
                }
            }
        }
        for (int i = 0; i < length; i++) {
             arrCopy[i].show();

        }
    }
}
