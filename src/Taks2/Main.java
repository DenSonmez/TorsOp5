package Taks2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Main {


    public static void main(String[] args) {
        Room room1 = new Room(5, 3, 6 );
        Room room2 = new Room(3, 6, 7 );
        Room room3 = new Room(6, 4, 4 );

        ArrayList<Room>rooms = new ArrayList<>(Arrays.asList(room1,room2,room3));

        Building b2 = new Building(rooms, 3,3,false);

        System.out.println(countLampsInBuilding(b2));
        System.out.println(isNormal(b2));


        }
        public static int countLampsInBuilding(Building b2){
        int sum = 0;
        for(Room r: b2.getRooms()){
            sum +=r.getNumberOfLamps();
        }
        return sum; //denne er uden for fordi den skal gå i gennem alle


            }

            public static boolean isNormal(Building b2){
        int floors = b2.getNumberOfFloors();
        int rooms =b2.getRooms().size();

        if( floors>rooms){
            System.out.println("This building is odd");
            return false;
        }
            return true;

    }
}
