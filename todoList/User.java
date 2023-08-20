package todoList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User extends Task {
    String name;
    public User(){
        System.out.println("Enter 1 to add task:");
        Scanner s = new Scanner(System.in);
        int getInput = s.nextInt();
        if(getInput == 1){
            System.out.println("please wait!");
            System.out.println("please enter your task to add:");
            String task = s.next();
            addTask(task);
            System.out.println("To add another task press 1 or to exit press 0");
           int toggle;

        try {
            System.out.println("Enter an integer toggle value:");
            toggle = s.nextInt();

            while (toggle != 0) {
                System.out.println("Enter your task to add:");
                 task = s.next();
                addTask(task);
                System.out.println("Enter an integer toggle value:");
                toggle = s.nextInt();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

            System.out.println("task added successfully!");
            return;

        }
    }
   

