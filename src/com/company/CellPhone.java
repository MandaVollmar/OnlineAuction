package com.company;

public class CellPhone extends ElectronicDevices {
    //TODO update owner to bidder object
    private String owner;
    private boolean is5G;

    public CellPhone(String description, double cost, String type, String manufacturer, int age, boolean hasWarranty,
                     String owner, boolean is5G) {
        super(description,cost, type, manufacturer, age, hasWarranty);
        this.owner=owner;
        this.is5G=is5G;
    }
    public CellPhone(){

    }

    public String getOwner() {
        return owner;
    }
    public boolean getIs5G(){
        return is5G;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Owner: "+owner+"\n Has 5G?"+ is5G);
    }
}