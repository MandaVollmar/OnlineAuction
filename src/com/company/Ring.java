package com.company;

public class Ring extends Jewelry {
    private int size;

    public Ring (double cost, String description, String type, String material, double weight, int size){
        super(cost, description, type, material, weight);
        this.size=size;
    }
    public Ring(){

    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Size: "+ size);
    }
}
