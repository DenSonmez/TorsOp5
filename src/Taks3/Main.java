package Taks3;

import Taks2.Room;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static ArrayList<Customer> customers;

    public static void main(String[] args) {

        Customer c1 = new Customer("Ramus" , "Num", "RasNum");
        Customer c2 = new Customer("Victor", "Nus ", "ViNus ");
        Customer c3 = new Customer("Daniel ", "Dodo ", "Ddodo ");
        Customer c4 = new Customer("Kristian ", "Killer", "KKil");
        Customer c5 = new Customer("Morten ", "Pet", "MortPet ");
        Customer c6 = new Customer("Peter ", "Mort ", "PetMor ");


        customers = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6));

        printCustomer();
    }
//kriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop.
// Test metoden fra main ved at kalde den.

    public static void printCustomer() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}



