package Oops.Components.Inheritance;

public class VechileTest {
    public static void main(String[] args) {
        Vechile v = new Vechile();
        v.printIt();
        Car c = new Car();
        c.color = "red";
        c.maxSpeed = 700;
        c.printIt();
        Bicycle b = new Bicycle();
        b.color = "blue";
        b.maxSpeed = 12;
        b.printIt();
    }
}
