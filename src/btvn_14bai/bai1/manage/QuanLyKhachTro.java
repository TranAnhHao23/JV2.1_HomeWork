package btvn_14bai.bai1.manage;


import btvn_14bai.bai1.model.Nguoi;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachTro implements Serializable {
    ArrayList<Nguoi> danhSachTro = new ArrayList<>(); // có thể gán danhSachTro bằng readCSV cho đỡ mất thông tin.
    Scanner sc = new Scanner(System.in);


    public QuanLyKhachTro() {

    }

    public Nguoi taoNguoiTro() {
        System.out.println("Nhập thông tin khách trọ: ");
        System.out.print("Họ và tên: ");
        String hoVaTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Số CMND: ");
        int soCMND = sc.nextInt();
        System.out.print("Số ngày trọ: ");
        int soNgayTro = sc.nextInt();
        sc.nextLine();
        System.out.print("Loại phòng trọ: ");
        String loaiPhongTro = sc.nextLine();
        System.out.println("Giá phòng: ");
        double giaPhong = sc.nextInt();
        sc.nextLine();

        return new Nguoi(hoVaTen, ngaySinh, soCMND, soNgayTro, loaiPhongTro, giaPhong);
    }

    public void themNguoiTro() {
        Nguoi nguoiTro = taoNguoiTro();
        danhSachTro.add(nguoiTro);
    }

    public Nguoi xoaNguoiTro(int soCMND) {
        Nguoi nguoiXoa = null;
        for (Nguoi nguoi : danhSachTro) {
            if (nguoi.getSoCMND() == soCMND) {
                danhSachTro.remove(nguoi);
                nguoiXoa = nguoi;
            }
        }
        return nguoiXoa;
    }

    public ArrayList<Nguoi> hienThiDanhSach() {
        return danhSachTro;
    }

    public double tinhTienTro(int soCMND) {
        double tienTro = -1;
        for (int i = 0; i < danhSachTro.size(); i++) {
            if (danhSachTro.get(i).getSoCMND() == soCMND) {
                tienTro = danhSachTro.get(i).getSoNgayTro() * danhSachTro.get(i).getGiaPhong();
                return tienTro;
            }
        }
        return tienTro;
    }

    public void writeCSV(ArrayList<Nguoi> danhSach, String pathName) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
            objectOutputStream.writeObject(danhSach);
            objectOutputStream.close();
            System.out.println("Ghi thành công");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println("Ghi thất bại");
        }
    }

    public void readCSV(String pathName) {
        ArrayList<Nguoi> danhSach = null;

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
            danhSach = (ArrayList<Nguoi>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.err.println(e.getMessage());
        }

        danhSach.forEach((nguoi) -> System.out.println(nguoi));
    }


}
