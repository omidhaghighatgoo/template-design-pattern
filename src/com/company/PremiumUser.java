package com.company;

public class PremiumUser extends ServiceProvider {

    @Override
    void stepOne() {
        System.out.println("step #1 : you should sign in");
    }

    @Override
    void stepTwo() {
        System.out.println("step #2 : for using this service you don't need to pay ");
    }

    @Override
    void stepThree() {
        System.out.println("step #3 : now you can use this service");
    }
}
