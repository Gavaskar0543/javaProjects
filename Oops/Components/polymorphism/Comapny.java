package Oops.Components.polymorphism;

public class Comapny {
    String branchCode;
   static int revenue;
   static int noOfEmployee;
   Comapny(String Code){
  this.branchCode = Code;
   }
   
   public void print(){
    System.out.println("branch"+"  "+branchCode+"   "+revenue);
   }

}
