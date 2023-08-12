/**
 * User
 */
public class Student {
private int rollNo;
private String name;
private String Result;
public Student(int roll,String name){
    this.rollNo = roll;
    this.name = name;
}

public void display(){
    System.out.println("name :"+""+name+" "+"rollNo:"+" "+rollNo);
}

}