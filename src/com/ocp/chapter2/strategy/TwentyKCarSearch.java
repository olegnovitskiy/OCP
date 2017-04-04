package com.ocp.chapter2.strategy;

class TwentyKCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {
        return car.getCostUSD() > 20000;
    }
}