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
        yearFounded=2020;
        factoryInfo();

        // type varName = value;
        // object of type house
        House h1 = new House();
        h1.address = "170 centre street";
        h1.owner = "Mr. Kim";
        h1.isOccupied = true;
        h1.size = 1000.81;
        h1.walls = 8;
        System.out.println("the owner is "+h1.owner);
        System.out.println("the address is "+h1.address);
        System.out.println("it is " + h1.isOccupied + " that the house is occupied");
        System.out.println("the house is " + h1.size + " square feet");
        System.out.println("the house has " + h1.walls + " walls");

        //todo: change the value of the yearFounded and isOpen
        //todo: call factory info again
        // todo: give all the house instance varaibles values

    }
    public void factoryInfo(){
        System.out.println("the factory info: ");
        System.out.println("the year founded");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");
        System.out.println("the earnings " + earnings);
        System.out.println("we make " + products);
        //todo: add souts to print the factorys instance variables

    }


}
