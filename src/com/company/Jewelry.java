package com.company;

public class Jewelry extends Item {
    private String type;
    private String material;
    private double weight; //grams

    //TODO refactor type variable, move to Item Class.
    public Jewelry(double cost, String description, String type, String material, double weight) {
        super(cost, description);
        this.type = type;
        this.material = material;
        this.weight = weight;
    }

    public Jewelry() {

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: " + type + "\nMaterial: " + material + "\nWeight: " + weight);

    }
}
