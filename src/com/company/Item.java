package com.company;

import java.util.Random;

public class Item {
    //test hello world, additional test
    private double cost;
    private String description;
    private int serialNumber;

    public Item(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public Item() {

    }
    public void generateSerialNumber(){
        //Random rand = new Random(System.currentTimeMillis());
        int max = 9999;
        int min = 1000;
        serialNumber= (int)Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void printDetails(){
        System.out.println("Description: "+ description +"\n Cost: "+ cost+"\n Serial Number: "
        +serialNumber);
    }

}
