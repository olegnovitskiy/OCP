package com.ocp.chapter2.strategy;

class CompactCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {
        return car.getType().equals(CarType.COMPACT);
    }
}
