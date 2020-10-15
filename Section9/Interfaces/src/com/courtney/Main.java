package com.courtney;

public class Main {

    public static void main(String[] args) {

        ITelephone courtneysPhone;
        courtneysPhone = new DeskPhone(123456);
        courtneysPhone.powerOn();
        courtneysPhone.callPhone(123456);
        courtneysPhone.answer();
        
    }
}
