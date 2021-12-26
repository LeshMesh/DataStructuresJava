package quru.qa;

public class Car {
    String model, transmission, body;
    int dateRelease, age, mileage;
    int mediumMileageYear = 17000;
    boolean autoTransmission;
    double boostSpeed;

    public void ageCar() {
        age = 2021 - dateRelease;
    }

    public void transmissionCar() {
        if (autoTransmission) {
            transmission = "Auto";
        } else {
            transmission = "Manual";
        }
    }

    public void mileageCar() {
        mileage = mediumMileageYear * age;
    }

    public void infoCar() {
        System.out.println(model + " " + body + ", Age = " + age + " year, Mileage = " + mileage
                + ", Transmission = " + transmission + ", Boost " + boostSpeed);
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model = "BMW 3 series";
        bmw.dateRelease = 2020;
        bmw.autoTransmission = false;
        bmw.body = "sedan";
        bmw.boostSpeed = 7.1;

        Car audi = new Car();
        audi.model = "Audi A4";
        audi.dateRelease = 2018;
        audi.autoTransmission = true;
        audi.body = "wagon";
        audi.boostSpeed = 7.5;

        bmw.ageCar();
        bmw.mileageCar();
        bmw.transmissionCar();
        bmw.infoCar();

        audi.ageCar();
        audi.mileageCar();
        audi.transmissionCar();
        audi.infoCar();
    }
}
