package To_DO;

public class Task {
    private String title;
    private String description ="";
    private int date = 0;
    private String state = "Active";

    public Task(String title , String description , int date ){
        this.date = date;
        this.description = description;
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public int getDate(){

        return this.date;
    }
    public String getState(){
        return state;
    }


    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setDate(int date){
        this.date = date;
    }
    public void setStateDone(){
        this.state = "Termine";
    }
    public void setStatePause(){
        this.state = "Pause";
    }
    public void setStateActif(){
        this.state = "Active";
    }


    public void afficher(){
        System.out.println("Task : "+ this.title + " Description : " + this.description + "dead line in " + this.date + " days");
    }

}
