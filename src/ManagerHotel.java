import Person.Hotel;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHotel {
    public static Scanner scanner = new Scanner(System.in);
    public static Hotel hotel = new Hotel();

    //Danh sách thuộc tính
    List<Hotel> arrHotels = new ArrayList<>();

    //Danh sách phương thức
    public void addNewHotel() {
        hotel.addHotel();
        arrHotels.add(hotel);
    }

    public void displayAll() {
        for (int i = 0; i < arrHotels.size(); i++) {
            System.out.println(arrHotels.get(i));
            System.out.print("\n");
        }
    }

    public void searchCustomer() {
        System.out.println("Nhập số chứng minh thư cần tìm kiếm: ");
        int searchCardID = scanner.nextInt();
        byte count = 0;
        for (int i = 0; i < arrHotels.size(); i++) {
            if (searchCardID == arrHotels.get(i).getCardID()) {
                System.out.println(arrHotels.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    public void removeCustomer() {
        System.out.println("Nhập số chứng minh thư cần xóa: ");
        int removeCardID = scanner.nextInt();
        byte count = 0;
        for (int i = 0; i < arrHotels.size(); i++) {
            if (removeCardID == arrHotels.get(i).getCardID()) {
                arrHotels.remove(arrHotels.get(i));
                System.out.println("Đã xóa");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy số CMT để xóa");
        }
    }

    public void totalPrice() {
        System.out.println("Nhập số chứng minh để tính tổng tiền: ");
        int totalFormCardID = scanner.nextInt();
        int total;
        byte count = 0;
        for (int i = 0; i < arrHotels.size(); i++) {
            if (totalFormCardID == arrHotels.get(i).getCardID()) {
                total = hotel.getDateMotel() * hotel.getPriceMotel();
                System.out.println("Tổng tiền phải trả là: " + total);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

}
