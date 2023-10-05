package Task2;

import java.io.File;
import java.util.Scanner;

//2.b
public class Main {
    public static void main(String[] args) {
        //2.g
        Cafe cafe1 = new Cafe();
        cafe1.loadMenuData();
        for (String s : cafe1.getMenu()) {
            System.out.println(s);
        }
    }
}