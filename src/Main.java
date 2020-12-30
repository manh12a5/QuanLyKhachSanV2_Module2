import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerHotel managerHotel = new ManagerHotel();

    public static void main(String[] args) {
        System.out.println("---- Quản lý Khách Sạn ----");
        byte choice;
        do {
            listChoice();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    managerHotel.addNewHotel();
                    break;
                case 2:
                    //DisplayAll
                    managerHotel.displayAll();
                    break;
                case 3:
                    //Search
                    managerHotel.searchCustomer();
                    break;
                case 4:
                    //Remove
                    managerHotel.removeCustomer();
                    break;
                case 5:
                    //Total
                    managerHotel.totalPrice();
                    break;
            }
        } while (choice != 0);
        System.exit(0);
    }

    private static void listChoice() {
        System.out.println("1. Nhập thông tin khách hàng");
        System.out.println("2. Hiển thị toàn bộ thông tin khách hàng");
        System.out.println("3. Tìm kiếm");
        System.out.println("4. Xóa thông tin khách hàng");
        System.out.println("5. Tính tổng tiền thuê phòng");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

}
