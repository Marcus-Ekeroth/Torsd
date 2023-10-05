package Task1;

public class Customer {
    //1.a
  private String firstName;
  private  String lastName;
  private  String userName;
  private  int id;

    //1.b
   Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String toString(){
       String s = "";
       s = "Name: " + firstName +" " + lastName + " User: "+ userName;
       return s;
    }

    public String getFirstName(){
       return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getUserName(){
        return this.userName;
    }

    public int getId(){
        return this.id;
    }
}
