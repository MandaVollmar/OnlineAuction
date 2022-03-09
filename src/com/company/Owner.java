package com.company;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Item> ownedItems = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Item> getOwnedItems() {
        return ownedItems;
    }
}
