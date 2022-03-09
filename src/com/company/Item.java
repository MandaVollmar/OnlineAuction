package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Item {
    //test hello world, additional test
    private double cost;
    private String description;
    private int serialNumber;
    private Owner owner;
    private double buyNowPrice;
    private List<Bid> bids;

    //TODO automatically add item inventory
    public Item(double cost, String description) {
        this.cost = cost;
        this.description = description;
        this.buyNowPrice = cost * 2;
        bids = new ArrayList<>();
    }

    public Item() {
        bids = new ArrayList<>();
    }

    public void generateSerialNumber() {
        //Random rand = new Random(System.currentTimeMillis());
        int max = 9999;
        int min = 1000;
        serialNumber = (int) Math.floor(Math.random() * (max - min + 1)) + min;
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

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setBuyNowPrice(double buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    public double getBuyNowPrice() {
        return buyNowPrice;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public void printDetails() {
        System.out.println("Description: " + description + "\nCost: " + cost + "\nSerial Number: "
                + serialNumber + "\nBuy Now Price: " + buyNowPrice);
    }

}
