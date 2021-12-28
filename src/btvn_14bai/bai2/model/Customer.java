package btvn_14bai.bai2.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String address;
    private int electricMeterID;

    public Customer() {
    }

    public Customer(String name, String address, int electricMeterID) {
        this.name = name;
        this.address = address;
        this.electricMeterID = electricMeterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getElectricMeterID() {
        return electricMeterID;
    }

    public void setElectricMeterID(int electricMeterID) {
        this.electricMeterID = electricMeterID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", electricMeterID=" + electricMeterID +
                '}';
    }
}

