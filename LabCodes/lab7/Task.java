package LabCodes.lab7;

public class Task {
    private String taskName;
    private int energyCost;

    //constructor
    public Task(String taskName, int energyCost){
        this.taskName = taskName;
        this.energyCost = energyCost;
    }
    //getter
    public int getEnergyCost() {return energyCost;}
    public String getTaskName() {return taskName;}
    //setter
    public void setEnergyCost(int energyCost){this.energyCost = energyCost;}
    public void setTaskName(String taskName){this.taskName = taskName;}

    public void describeTask() {
	    System.out.println(taskName + " " + energyCost);
    }


}
