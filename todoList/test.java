package todoList;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Task task = new Task();
        task.addTask("revice java");
        task.addTask("go to gym");
        task.addTask("practice dsa");
        task.updateTask("go to gym", "go to movie");
        task.deleteTask("go to movie" );
        task.showTask();
        System.out.println(task.taskCount());
    }
}
