import com.sun.corba.se.impl.legacy.connection.SocketFactoryContactInfoImpl;

public class Factory {

    // instance variables
    public int yearFounded;
    public boolean isOpen;
    public double earnings;
    public String products;

    public static void main(String[] args) {
        System.out.println("Welcome to Wills factory");

        new Factory();



    }

    // constructor
    public Factory(){
        System.out.println("we make houses!");
        yearFounded= 2025;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        int x;
        factoryInfo();

        //todo: change the value of the yearFounded and isOpen
        //todo: call factory info again

    }
    public void factoryInfo(){
        System.out.println("the factory info: ");
        System.out.println("the year founded");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");
        System.out.println("the earnings " + earnings);
        System.out.println(products);
        //todo: add souts to print the factorys instance variables

    }


}
