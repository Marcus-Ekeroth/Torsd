package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //3.g
        Room bathroom = new Room(1, 2, 0);
        Room cafeteria = new Room(4, 30, 18);
        Room entryHall = new Room(2,10, 6);
        //3.h
        ArrayList<Room> rooms1 = new ArrayList<>();
        rooms1.add(bathroom);
        rooms1.add(cafeteria);
        rooms1.add(entryHall);

        //3.i
        Building cphBusiness = new Building(rooms1, 1, 3, true);
        
    }
    //3.j
    public static int countLampsInBuilding(Building building){
        int lamps = 0;
        for(Room s: building.getRooms()){
            lamps += s.getNumberOfLamps();
        } return lamps;
    }
    //3.k
    public static boolean isNormal(Building building){
        if(building.getNumberOfFloors() < building.getRooms().size()){
            return true;
        }
        else{
            System.out.println("This is an odd building");
            return false;
        }
    }
}
