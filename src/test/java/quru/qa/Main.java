package quru.qa;

public class Main {
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
