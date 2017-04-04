package com.ocp.chapter2.strategy;

class Car {
    private String name;
    private CarType type;
    private long costUSD;

    public long getCostUSD() {
        return costUSD;
    }

    public void setCostUSD(long costUSD) {
        this.costUSD = costUSD;
    }

    public Car(String name, long costUSD, CarType type) {
        this.name = name;
        this.type = type;
        this.costUSD = costUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
