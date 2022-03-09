package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Auction {
    private Inventory inventory;

    public Auction(Inventory inventory) {
        this.inventory = inventory;
    }

    public Auction() {

    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }
    //  [tv, phone]
    //    0    1

    public void makeBid(Item item, Bid bid, Owner bidder) {
        if (bid.getBidAmount() >= item.getBuyNowPrice()) {
            item.setOwner(bidder);
            bidder.getOwnedItems().add(item);
            //for (int i = 0; i < inventory.getElectronics().size(); i++) {
            //if (item.generateSerialNumber() == inventory.getElectronics().get(i).generateSerialNumber())
        } else if (bid.getBidAmount() > item.getCost()) {
            item.setCost(bid.getBidAmount());
            item.getBids().add(bid);
        } else {
            System.out.println("Invalid bid, bid to low");
        }

    }

    public void startAuction() {
        Scanner userInput = new Scanner(System.in);

        Ring ringOne = new Ring(99.99, "Engagement Ring", "Ring", "gold", 4.2, 6);
        ringOne.generateSerialNumber();
        CellPhone phone = new CellPhone("Smartphone", 800, "Cellphone", "Samsung", 1, true, false);

        List<ElectronicDevices> electronics = new ArrayList<>();
        electronics.add(phone);
        List<Jewelry> jewelry = new ArrayList<>();
        jewelry.add(ringOne);

        Inventory inventory = new Inventory(electronics, jewelry);


        System.out.println("Welcome to the online auction, what would you like to do 1)View items 2) Place Bid");
        int userSelection = userInput.nextInt();

        if (userSelection == 1) {
            for (Item electronic : inventory.getElectronics()) {
                electronic.printDetails();
            }
            for (Item currentJewelery : inventory.getJewelry()) {
                currentJewelery.printDetails();
            }

        }

    }

    /*
        1)Ask which category user would like to view/get information on
        2) print the type of category
        3) get input from user on selected category
        4) Display items names and ask if they want more information on any specific item
        5) print attributes of selected item
        6) ask if they want to bid or buy item outright
        7) if bid is selected
            - create bid if first bid
            - incerase bid
        8) if bought

     */


}
