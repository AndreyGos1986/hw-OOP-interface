package ru.skypro;

public class Truck extends Transport implements TransportInterface {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
