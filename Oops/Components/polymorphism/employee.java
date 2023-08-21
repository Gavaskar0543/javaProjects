package Oops.Components.polymorphism;

public class employee extends Comapny{
     int employeeId;
    int salary;
    String branchCode;
    employee(String Code) {
        super(Code);
        this.branchCode = Code;
       
    }

  
public void printId(){
    System.out.println(employeeId);
}
    public void print(){
        super.print();
        System.out.println("salary"+" : "+salary);
    }
}
