package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//2.c
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    //2.c (der står 2.c to gange i opgavebeskrivelse)


    public void loadMenuData(){
        //2.d
        File file = new File("src/Task2/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            //2.e
            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }


        }
    public ArrayList<String> getMenu(){
        return coffeeMenu;
    }
}
