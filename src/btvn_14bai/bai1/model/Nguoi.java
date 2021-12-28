package btvn_14bai.bai1.model;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String hoVaTen;
    private String ngaySinh;
    private int soCMND;
    private int soNgayTro;
    private String loaiPhongTro;
    private double giaPhong;


    public Nguoi() {
    }

    public Nguoi(String hoVaTen, String ngaySinh, int soCMND, int soNgayTro, String loaiPhongTro, double giaPhong) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", soCMND=" + soCMND +
                ", soNgayTro=" + soNgayTro +
                ", loaiPhongTro='" + loaiPhongTro + '\'' +
                ", giaPhong=" + giaPhong +
                '}';
    }
}
