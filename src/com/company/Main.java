package com.company;

public class Main {

    public static void main(String[] args) {



        ServiceProvider user = new PremiumUser();
        user.init();
        System.out.println("-------------------------------");
        user = new FreeUser();
        user.init();

    }
}
