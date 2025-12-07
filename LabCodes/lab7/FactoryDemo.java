package LabCodes.lab7;
import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        Robot rbt1 = new Robot("Robot1", 89, "Active");
        Robot rbt2 = new Robot("Robot2", 11, "Disabled");
        Task tsk1 = new Task("Walk", 10);


        rbt1.displayRobotInfo();
        rbt2.displayRobotInfo();


        System.out.println("Please add an amount of battery to consume: ");
        int consumedBattery = scn.nextInt();

        rbt1.consumeBattery(consumedBattery);
        rbt1.displayRobotInfo();
        //it has succeeded.

		Task Walk = new Task("Walk", 10);
	    Task Run = new Task("Run", 15);
	    Task jump = new Task("Jump", 20);
	    rbt1.performTask(Walk);
		rbt1.displayRobotInfo();

		TaskBatch doTask = new TaskBatch();
		doTask.addTask(Walk);
		doTask.addTask(Run);
		doTask.addTask(jump);

		doTask.printBatchInfo();
		doTask.getTotalEnergyCost();

    }
}