package prasad.com.practice.model;

public class Bike {
    private int bikeId;
    private String make;
    private String color;
    private static Bike bike;
//rule 4 make bike the bike as static
//rule 2 do not allow any method to set attribute of class
//    rule 1 make your constructor private
private Bike(int bikeId, String make, String color) {
        this.bikeId = bikeId;
        this.make = make;
        this.color = color;
    }
//    rule 2 provide getter method for object
    public static synchronized Bike getBike(int bikeId,String make,String color){
//    rule 5 create object only once
    if (bike==null) {
        bike = new Bike(bikeId, make, color);
    }else {
        bike.bikeId=bikeId;
        bike.make=make;
        bike.color=color;
    }
    return bike;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
