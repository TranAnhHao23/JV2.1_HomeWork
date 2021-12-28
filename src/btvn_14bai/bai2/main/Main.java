package btvn_14bai.bai2.main;

import btvn_14bai.bai2.manage.Manager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        int choice;
        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Nhập thông tin hộ dân");
            System.out.println("2. Hiển thị toàn bộ danh sách hóa đơn");
            System.out.println("3. Ghi vào file CSV");
            System.out.println("4. Đọc file CSV");
            System.out.println("0. Thoát!!!");
            System.out.println("-------------------------");
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    manager.addBill();
                    break;
                case 2:
                    manager.displayBills().forEach((i,b) -> System.out.println(b));
                    break;
                case 3:
                    manager.writeCSV(manager.displayBills(),"src/btvn_14bai/bai2/save");
                    break;
                case 4:
                    manager.readCSV("src/btvn_14bai/bai2/save").forEach((i,b) -> System.out.println(b));
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Sai lựa chọn!!");
                    break;
            }
        } while (choice != 0);

    }
}
