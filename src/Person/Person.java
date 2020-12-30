package Person;

import java.util.Scanner;

public class Person {

    //Danh sách thuộc tính
    private String name;
    private String birthday;
    private int cardID;

    //Danh sách phương thức
    public Person() {
    }

    public Person(String name, String birthday, int cardID) {
        this.name = name;
        this.birthday = birthday;
        this.cardID = cardID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng: ");
        name = scanner.nextLine();
        do {
            System.out.println("Nhập ngày sinh khách hàng (dd/MM/yyyy): ");
            birthday = scanner1.nextLine();
        } while (birthday.length() < 8);
        System.out.println("Nhập số chứng minh thư nhân dân của khách hàng: ");
        cardID = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "{ Thông tin khách hàng }" + "\n" +
                "Họ tên: " + name + "\n" +
                "Ngày sinh: " + birthday + "\n" +
                "Số chứng minh thư: " + cardID + "\n" +
                "--------------------";
    }

}
