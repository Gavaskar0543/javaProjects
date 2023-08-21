package Oops.Components.Inheritance;

/**
 * Car
 */
public class Car extends Vechile{
int numOfDoors;
Car(int maxSpeed){
    super(maxSpeed);
}

public void print(){
    super.printIt();
    System.out.println("vechile"+" "+"color"+":"+getcolor()+" "+"maxSpeed"+":"+" "+maxSpeed+" "+"no.of.Doors"+" : "+numOfDoors);

}
    
}