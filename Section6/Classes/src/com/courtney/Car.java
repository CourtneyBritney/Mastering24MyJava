package com.courtney;

public class Car {

     private int doors;
     private int wheels;
     private String model;
     private String engine;
     private String colour;

     public void setModel(String model) {
          String validModel = model.toLowerCase();
          if(validModel.equals("urus") || validModel.equals("audi")) {
               this.model = model;    //this keyword allows you to access fields of the current class.
          } else {
               this.model = "Unknown";
          }

     }

     public String getModel() {
         return this.model;
     }
}
