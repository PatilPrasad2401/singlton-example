package prasad.com.practice;

import prasad.com.practice.model.Bike;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Bike bike=Bike.getBike(1,"yamaha","black");
        Bike bike1= Bike.getBike(2,"honda","black");

        System.out.println("First bike object"+bike);
        System.out.println("second bike object"+bike1);

    }
}
