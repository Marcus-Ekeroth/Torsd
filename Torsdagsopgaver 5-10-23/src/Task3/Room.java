package Task3;

public class Room {
    //3.a
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //3.b
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3.c
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public int getNumberOfLamps(){
        return numberOfLamps;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }
}
