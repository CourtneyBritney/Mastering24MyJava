package com.courtney;

public class Main {

    public static void main(String[] args) {
	    Car lamborghini = new Car();    //object
        Car audi = new Car();
        lamborghini.setModel("Urus");
        System.out.println("Model is " + lamborghini.getModel());
    }
}

