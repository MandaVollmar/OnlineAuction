package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ElectronicDevices tv = new ElectronicDevices();
        tv.setType("TV");
        tv.setAge(2);
        tv.setHasWarranty(true);
        tv.generateSerialNumber();
        System.out.println(tv.getSerialNumber());
        Ring ringOne=new Ring(99.99,"Engagement Ring", "Ring", "gold",4.2, 6);
        ringOne.generateSerialNumber();
        tv.printDetails();
        ringOne.printDetails();
    }

}
