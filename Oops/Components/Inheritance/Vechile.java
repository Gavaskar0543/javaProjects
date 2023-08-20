package Oops.Components.Inheritance;

/**
 * Vechile
 */
public class Vechile {
int maxSpeed;
private String color;
//setter
public void setColor( String color){
    this.color = color;

}
//getter
public String getcolor(){
return this.color;
}
public void printIt(){
    System.out.println("vechile"+" "+"color"+":"+color+" "+"maxSpeed"+":"+" "+maxSpeed);
}
}