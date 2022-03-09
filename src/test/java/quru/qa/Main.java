package quru.qa;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model = "BMW 3 series";
        bmw.dateRelease = 2021;
        bmw.autoTransmission = false;
        bmw.body = "sedan";
        bmw.boostSpeed = 7.2;

        Car audi = new Car();
        audi.model = "Audi A4";
        audi.dateRelease = 2018;
        audi.autoTransmission = true;
        audi.body = "wagon";
        audi.boostSpeed = 7.5;

        Car lada = new Car();
        lada.model = "Lada Vesta";

        lada.dateRelease = 2013;
        lada.autoTransmission = false;
        lada.body = "sw cross";
        lada.boostSpeed = 12.2;


        bmw.ageCar();
        bmw.mileageCar();
        bmw.transmissionCar();
        bmw.infoCar();

        audi.ageCar();
        audi.mileageCar();
        audi.transmissionCar();
        audi.infoCar();

        lada.ageCar();
        lada.mileageCar();
        lada.transmissionCar();
        lada.infoCar();
    }
}
