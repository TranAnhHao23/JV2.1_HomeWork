package btvn_14bai.bai2.model;

import java.io.Serializable;

public class Bill extends Customer implements Serializable {
    private double oldIndex;
    private double newIndex;

    public Bill() {
    }

    public Bill(String name, String address, int electricMeterID, double oldIndex, double newIndex) {
        super(name, address, electricMeterID);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    @Override
    public String toString() {
        return super.toString()+"oldIndex="+oldIndex+"newIndex="+newIndex+"totalFee="+((newIndex-oldIndex)*750);
    }
}
