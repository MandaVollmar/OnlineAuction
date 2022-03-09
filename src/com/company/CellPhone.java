package com.company;

public class CellPhone extends ElectronicDevices {
    //TODO update owner to bidder object

    private boolean is5G;

    public CellPhone(String description, double cost, String type, String manufacturer, int age, boolean hasWarranty,
                     boolean is5G) {
        super(description, cost, type, manufacturer, age, hasWarranty);

        this.is5G = is5G;
    }

    public CellPhone() {

    }

    public boolean getIs5G() {
        return is5G;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Has 5G?" + is5G);
    }
}