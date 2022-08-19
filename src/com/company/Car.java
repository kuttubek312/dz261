package com.company;

public class Car {
    private int id;
    private  int CarNumber;

    public Car(int id, int carNumber) {
        this.id = id;
        CarNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", CarNumber=" + CarNumber +
                '}';
    }
}
