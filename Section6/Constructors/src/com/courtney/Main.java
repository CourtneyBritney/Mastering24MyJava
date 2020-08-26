package com.courtney;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account();//"12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
        Account kimsAccount = new Account("Kim", "kim@email.com", "12345");
        System.out.println(kimsAccount.getNumber() + " name " + kimsAccount.getCustomerName());
        System.out.println("Current balance is " + kimsAccount.getBalance());
        kimsAccount.withdrawal(100.55);

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Kim", 100.0, "kim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

    }
}
