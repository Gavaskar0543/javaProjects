package todoList;

public class Task {
    String[] arr = new String[10];
    static int  taskCounter = 0;
    public void addTask( String task){
        String newTask = task.toLowerCase().trim();
        arr[taskCounter] = newTask;
        taskCounter++;
        System.out.println("Task added Successfully!");
    }
    public void showTask(){
        for(int i =0;i<taskCounter;i++){
            System.out.println(arr[i]);
        }

    }
    public void updateTask(String oldTask,String newTask){
        for(int i =0;i<taskCounter;i++){
            if(arr[i] == oldTask){
                arr[i] = newTask;
                System.out.println("task updated succesfully!");
                return;
            }
            System.out.println("task not found! check spelling!");
        }

    }
    public void deleteTask(String task){
        int markPoint = 0;
        int checkDeleted = 0;
     for(int i =0;i<taskCounter;i++){
        if(arr[i] == task){
           markPoint = i;
           break;
        }
     }
     if(markPoint != 0){
     while(markPoint < taskCounter){
        arr[markPoint] = arr[markPoint+1];
        markPoint++;
        checkDeleted++;
     }
     taskCounter--;
     System.out.println("task deleted!");
     return;
    }
    System.out.println("no task deleted!");

    }
    public int taskCount(){
        return taskCounter;
    }
}
