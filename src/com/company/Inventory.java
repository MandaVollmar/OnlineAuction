package com.company;

import java.util.List;
import java.util.ArrayList;


public class Inventory {
    private List<ElectronicDevices> electronics = new ArrayList<>();
    private List<Jewelry> jewelry = new ArrayList<>();

    public Inventory(List<ElectronicDevices> electronics, List<Jewelry> jewelry) {
        this.electronics = electronics;
        this.jewelry = jewelry;

    }

    public  Inventory() {

    }

    public List<ElectronicDevices> getElectronics() {
        return electronics;
    }

    public List<Jewelry> getJewelry() {
        return jewelry;
    }

    public void setElectronics(List<ElectronicDevices> electronics) {
        this.electronics = electronics;
    }

    public void setJewelry(List<Jewelry> jewelry) {
        this.jewelry = jewelry;
    }


}
