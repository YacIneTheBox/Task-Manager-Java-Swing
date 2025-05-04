package To_DO;

import java.util.ArrayList;

public class ToDoList_Model {
    TaskList taskList = new TaskList();

    public void endTask(Task task){
        task.setStateDone();
    }
    public void pauseTask(Task task){
        task.setStatePause();
    }

    public void createTask(String title ,String description , int date){
        taskList.creationTask(title,description,date);
    }
    public void removeTask(Task task){
        taskList.removeTask(task);
    }
    public void checkFinishedtask(){
        if (!taskList.isEmpty()){
            for (int i = 0 ; i< taskList.nbrTask() ; i++){
                Task currentTask = taskList.getTask(i);
                if (currentTask.getState() == "Termine"){
                    taskList.removeTask(currentTask);
                }
            }
        }
    }




}
