package com.company;

public class Bid {
    private Item item;
    private double bidAmount;
    private Owner bidder;
    private double minBid;


    public Bid(Item item, double bidAmount, Owner bidder) {
        this.item = item;
        this.bidAmount = bidAmount;
        this.bidder = bidder;
        this.minBid = item.getCost();
    }

    public Bid() {

    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public void setBidder(Owner bidder) {
        this.bidder = bidder;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setMinBid(double minBid) {
        this.minBid = minBid;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public double getMinBid() {
        return minBid;
    }

    public Item getItem() {
        return item;
    }

    public Owner getBidder() {
        return bidder;
    }
}
