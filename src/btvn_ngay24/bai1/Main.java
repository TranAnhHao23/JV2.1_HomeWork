package btvn_ngay24.bai1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        LaptopManage manage = new LaptopManage();
        do {
            System.out.println("Menu lựa chọn");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Hiển thị sản phẩm theo hãng");
            System.out.println("6. Tìm kiếm sản phẩm trong khoảng giá");
            System.out.println("7. Tìm kiếm sản phẩm theo màu sắc");
            System.out.println("0. Thoát");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nhập số chứ không phải chữ bạn ơi!");
            }
            switch (choice) {
                case 1:
                    manage.addLaptop();
                    break;
                case 2:
                    try {
                        System.out.println("Nhập ID sản phầm cần sửa: ");
                        int idEdit = sc.nextInt();
                        manage.editLaptop(idEdit);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Nhập ID sản phầm cần xóa: ");
                        int idDelete = sc.nextInt();
                        manage.deleteLaptop(idDelete);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Hiển thị toàn bộ sản phẩm: ");
                        manage.displayLaptops();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 5:
                    try {
                        sc.nextLine();
                        System.out.println("Nhập hãng sản xuất cần tìm: ");
                        String brandFind = sc.nextLine();
                        ArrayList<Laptop> laptopsBrand = manage.displayByBrand(brandFind);
                        for (Laptop laptop : laptopsBrand) {
                            System.out.println(laptop);
                        }
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Nhập giá thấp: ");
                        int lowPrice = sc.nextInt();
                        System.out.println("Nhập giá cao: ");
                        int highPrice = sc.nextInt();
                        ArrayList<Laptop> laptopsPrice = manage.findByPrice(lowPrice, highPrice);
                        for (Laptop laptop : laptopsPrice) {
                            System.out.println(laptop);
                        }
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Nhập màu: ");
                        sc.nextLine();
                        String color = sc.nextLine();
                        ArrayList<Laptop> laptopsColor = manage.findByColor(color);
                        for (Laptop laptop : laptopsColor) {
                            System.out.println(laptop);
                        }
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Sai lựa chọn, chọn lại!");
                    break;
            }
        } while (choice != 0);
    }
}
