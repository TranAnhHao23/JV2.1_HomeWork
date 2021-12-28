package btvn_14bai.bai2.manage;

import btvn_14bai.bai2.model.Bill;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Manager {
    HashMap<Integer, Bill> bills = readCSV("src/btvn_14bai/bai2/save");
    Scanner sc = new Scanner(System.in);

    public Manager() {
    }

    public Bill creatBill(){
        System.out.println("Nhập thông tin hộ dân cư:");
        System.out.print("Họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Mã số công tơ điện: ");
        int electricMeterID = sc.nextInt();
        System.out.print("Chỉ số cũ: ");
        double oldIndex = sc.nextDouble();
        System.out.print("Chỉ số mới: ");
        double newIndex = sc.nextDouble();
        if (newIndex < oldIndex){
            return null;
        }
        sc.nextLine();
        return new Bill(name,address,electricMeterID,oldIndex,newIndex);
    }

    public void addBill(){
        Bill newBill = creatBill();
        bills.put(newBill.getElectricMeterID(),newBill);
    }

    public HashMap<Integer, Bill> displayBills(){
        return bills;

    }

    public void writeCSV(HashMap<Integer, Bill> bills, String pathName){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
            objectOutputStream.writeObject(bills);
            objectOutputStream.close();
            System.out.println("Ghi thành công");
        } catch (IOException e){
            System.err.println(e.getMessage());
            System.out.println("Ghi thất bại");
        }
    }

    public HashMap<Integer, Bill> readCSV(String pathName){
        HashMap<Integer, Bill> billsRead = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
            billsRead = (HashMap<Integer, Bill>)objectInputStream.readObject();
        }catch (IOException | ClassCastException | ClassNotFoundException | NullPointerException e){
            System.err.println(e.getMessage());
        }

        return billsRead;
    }



}
