package ru.skypro;

public class Car extends Transport implements TransportInterface {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
