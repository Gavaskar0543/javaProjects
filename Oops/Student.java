package Oops;


public class Student {
public String name;
private int rollNumber;
final  static int  fees = 10000;
static int numOfStudents;

//constructor
public Student(String name){
    this.name = name;
    numOfStudents++;
    this.rollNumber = numOfStudents;
}
//setter for private property
public void setRollNumber(int rollNumber){
    if(rollNumber <= 0){
        return;
    }
    this.rollNumber = rollNumber;
}
//getter private property
public int getRollNumber(){
    return  this.rollNumber;
}
public void printStudent(){
    System.out.println("name"+":"+name);
    System.out.println("rollNumber"+":"+rollNumber);
     System.out.println("fees"+":"+fees);
}
    
}