package Taks1;

import Taks1.Driver;

public class Main {
    public static void main(String[] args) {

        Driver d = new Driver ("Deniz ", 38);

        Car c = new Car("Fiat ", "punto ", 2022, "sport ");

        c.setDriver(d);

        System.out.println(c);
        System.out.println(d);


        Car c2 = new Car("Ford ", "mustang ", 2021, "sport ");

        c2.setDriver(d);

        System.out.println(c2);
        System.out.println(d);

            }
}