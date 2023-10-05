package Task1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1.c
        Customer c1 = new Customer("Frederik", "Dupont", "Frede 2");
        Customer c2 = new Customer("Frederik", "Moestrup", "Frede 1");
        Customer c3 = new Customer("Marcus", "Ekeroth", "Doginator");
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        printCustomers(customers);

    }
    //1.d
    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c: customers){
            System.out.println(c);
        }
    }
}