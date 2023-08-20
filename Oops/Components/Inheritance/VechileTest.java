package Oops.Components.Inheritance;

public class VechileTest {
    public static void main(String[] args) {
        Vechile v = new Vechile();
        v.printIt();
        Car c = new Car();
        c.setColor("red");
        c.maxSpeed = 700;
        c.numOfDoors=4;
        c.print();
        Bicycle b = new Bicycle();
        b.setColor("blue");
        b.maxSpeed = 12;
        b.printIt();
    }
}
