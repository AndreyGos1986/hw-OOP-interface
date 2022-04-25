package ru.skypro;

public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
            }
            car.updateTyre();
            car.checkEngine();
            separator();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
            }
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
            separator();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            }
            bicycle.updateTyre();
            separator();
        }
    }

    public void separator() {
        System.out.println("==========================");
    }
}
