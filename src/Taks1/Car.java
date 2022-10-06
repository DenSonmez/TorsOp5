package Taks1;

import Taks1.Driver;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    Driver driver;


    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    @Override
    public String toString() {
        return "Taks1.Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", year=" + year + ", bodyStyle='" + bodyStyle + '\'' + '}';
    }
}
