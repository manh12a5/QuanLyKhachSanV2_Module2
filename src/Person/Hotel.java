package Person;

import java.util.Scanner;

public class Hotel extends Person {

    //Danh sách thuộc tính
    private int dateMotel;
    private String typeMotel;
    private int priceMotel;
    private String informationCustomer;

    //Danh sách phương thức

    public Hotel() {
    }

    public Hotel(int dateMotel, String typeMotel, int priceMotel, String informationCustomer) {
        this.dateMotel = dateMotel;
        this.typeMotel = typeMotel;
        this.priceMotel = priceMotel;
        this.informationCustomer = informationCustomer;
    }

    public Hotel(String name, String birthday, int cardID, int dateMotel, String typeMotel, int priceMotel, String informationCustomer) {
        super(name, birthday, cardID);
        this.dateMotel = dateMotel;
        this.typeMotel = typeMotel;
        this.priceMotel = priceMotel;
        this.informationCustomer = informationCustomer;
    }

    public int getDateMotel() {
        return dateMotel;
    }

    public void setDateMotel(int dateMotel) {
        this.dateMotel = dateMotel;
    }

    public String getTypeMotel() {
        return typeMotel;
    }

    public void setTypeMotel(String typeMotel) {
        this.typeMotel = typeMotel;
    }

    public int getPriceMotel() {
        return priceMotel;
    }

    public void setPriceMotel(int priceMotel) {
        this.priceMotel = priceMotel;
    }

    public String getInformationCustomer() {
        return informationCustomer;
    }

    public void setInformationCustomer(String informationCustomer) {
        this.informationCustomer = informationCustomer;
    }

    public void addHotel() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số ngày trọ: ");
        dateMotel = scanner1.nextInt();
        System.out.println("Nhập loại phòng trọ: ");
        typeMotel = scanner.nextLine();
        System.out.println("Nhập giá phòng: ");
        priceMotel = scanner1.nextInt();
        System.out.println("Nhập thông tin cá nhân của khách trọ: ");
        informationCustomer = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "{ Thông tin khách trọ }" + "\n" +
                "Số ngày trọ: " + dateMotel + "\n" +
                "Loại phòng trọ: " + typeMotel + "\n" +
                "Giá phòng: " + priceMotel + "\n" +
                "Thông tin cá nhân của khách trọ: " + informationCustomer;
    }

}
