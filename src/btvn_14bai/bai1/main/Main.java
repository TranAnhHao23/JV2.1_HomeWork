package btvn_14bai.bai1.main;

import btvn_14bai.bai1.model.Nguoi;
import btvn_14bai.bai1.manage.QuanLyKhachTro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachTro quanLy = new QuanLyKhachTro();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm người trọ");
            System.out.println("2. Xóa người trọ thông qua CMND");
            System.out.println("3. Hiển thị toàn bộ người trọ");
            System.out.println("4. Tính tiển trọ thông qua CMND");
            System.out.println("5. Viết vào file CSV");
            System.out.println("6. Đọc file CSV");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    quanLy.themNguoiTro();
                    break;
                case 2:
                    System.out.println("Nhập số CMND: ");
                    int soCMNDXoa = sc.nextInt();
                    if (quanLy.xoaNguoiTro(soCMNDXoa) == null) {
                        System.out.println("không tồn tại số CMND trong danh sách");
                    } else {
                        System.out.println("Xóa thành công!");
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị toàn bộ danh sách");
                    for (Nguoi nguoi : quanLy.hienThiDanhSach()) {
                        System.out.println(nguoi);
                    }
                    break;
                case 4:
                    System.out.println("Nhập số CMND: ");
                    int soCMNDTien = sc.nextInt();
                    if (quanLy.tinhTienTro(soCMNDTien) != -1) {
                        System.out.println("Số tiền cần trả là: " + quanLy.tinhTienTro(soCMNDTien));
                    } else {
                        System.out.println("không tồn tại số CMND trong danh sách");
                    }
                case 5:
                    quanLy.writeCSV(quanLy.hienThiDanhSach(),"src/btvn_14bai/bai1/save");
                    break;
                case 6:
                    quanLy.readCSV("src/btvn_14bai/bai1/save");
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Sai lựa chọn!");
                    break;

            }

        } while (choice != 0);


    }

}
