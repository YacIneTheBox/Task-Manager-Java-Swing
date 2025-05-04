package To_DO;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    ArrayList<Task> tasklist = new ArrayList<>();

    public void creationTask(String title , String description , int date){
        Task newTask = new Task(title,description,date);
        tasklist.add(newTask);
    }

    public void removeTask(Task task){
            tasklist.remove(task);
    }

    public int nbrTask(){
        return tasklist.size();
    }

    public Task getTask(int i){
        return tasklist.get(i);
    }

    public boolean isEmpty(){
        if (tasklist.size() == 0){
            return true;
        }else{
            return false;
        }
    }



}
