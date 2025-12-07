package LabCodes.lab7;

import java.util.Scanner;

public class Robot {
	Scanner scn = new Scanner(System.in);
    private String modelName;
    private int batteryLevel;
    private String status;
    //constructor
    public Robot (String modelName, int batteryLevel,  String status ){
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }
    //getter
    public String getModelName() {return modelName;}
    public int getBatteryLevel() {return batteryLevel;}
    public String getStatus() {return status;}
    //setter
    public void setBatteryLevel(int batteryLevel) {this.batteryLevel = batteryLevel;}
    public void setModelName(String modelName) {this.modelName = modelName;}
    public void setStatus(String status) {this.status = status;}
    //Display info
    public void displayRobotInfo() {
        System.out.println("Model name: " + modelName);
        System.out.println("Battery level: " + batteryLevel);
        System.out.println("Current status: " + status);
        System.out.println();
    }
    //True false battery level check
    public boolean isBatteryEnough(int requiredAmount){
        if (batteryLevel >= requiredAmount) return true;
        else return false;
    }
    //Reduce battery amount
    public void consumeBattery(int amount){
        batteryLevel = batteryLevel - amount;
    }
    //Add charge
    public void chargeBattery(int amount){
        batteryLevel = batteryLevel + amount;
            if (batteryLevel >= 100){
                status = "Active";
            } else {
                status = "Charging";
            }

    }
	//Perform tasks
	public void performTask(Task t) {
		System.out.println("Robot attempting: " + t.getTaskName());
		if (status.equals("Charging")) {
			System.out.println("Cannot perform task robot is charging.");
			return;
		}
		if (isBatteryEnough(t.getEnergyCost())) {
			consumeBattery(t.getEnergyCost());
			System.out.println("Task completed.");
		} else {
			System.out.println("Not enough battery.");
		}


	}

}