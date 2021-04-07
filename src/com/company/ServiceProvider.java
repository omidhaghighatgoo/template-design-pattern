package com.company;

public abstract class ServiceProvider {

    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();

    public void init(){

        stepOne();
        stepTwo();
        stepThree();

    }
}
