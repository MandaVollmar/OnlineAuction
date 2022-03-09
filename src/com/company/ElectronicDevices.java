package com.company;

import java.time.LocalDate;

public class ElectronicDevices extends Item {
    private String type;
    private String manufacturer;
    private int age;
    private boolean hasWarranty; // indicates if electronic device warranty is still active

    //TODO refactor type variable, move to Item Class.
    public ElectronicDevices(String description, double cost, String type, String manufacturer, int age, boolean hasWarranty) {
        super(cost, description);
        this.type = type;
        this.manufacturer = manufacturer;
        this.age = age;
        this.hasWarranty = hasWarranty;
    }

    public ElectronicDevices() {

    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    public boolean getHasWarranty() {
        return hasWarranty;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: " + type + "\n Manufacturer: " + manufacturer + "\n Age: "
                + age + "Active Warranty: " + hasWarranty);
    }
}
