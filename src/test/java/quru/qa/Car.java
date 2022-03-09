package quru.qa;

public class Car {
    String model, transmission, body;
    int dateRelease, age, mileage;
    int mediumMileageYear = 17001;
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
}
