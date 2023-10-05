package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Building {
    //3.d
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    //3.e
    Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    //3.f
    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
}
