package com.company;

public class RandomNumber {

    int getRandom(Range rg) {
        return (int)(Math.random() * ((rg.getHigh()-rg.getLow())+1)+rg.getLow());
    }
}
