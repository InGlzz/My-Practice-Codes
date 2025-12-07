package LabCodes.lab7;

public class TaskBatch {
	private Task[] tasks;
	private int taskCount;
	public int totalEnergy;

	public TaskBatch() {
		tasks = new Task[5];
		taskCount = 0;
	}

	public void addTask(Task t) {
		if (taskCount < tasks.length) {
			tasks[taskCount] = t;
			taskCount++;
		} else {
			System.out.println("Cant add anymore tasks.");
		}
	}

	public void getTotalEnergyCost() {
		for (int i = 0; i < taskCount; i++){
			totalEnergy += tasks[i].getEnergyCost();
		}
	}

	public void getTasks(){
		for (int i = 0; i < taskCount; i++){
			System.out.println(tasks[i].getTaskName() + ", ");
		} if (tasks.length == 0){
			System.out.println("No tasks in line.");
		}
	}

	public void printBatchInfo() {
		for (int i = 0; i < taskCount; i++){
			System.out.print(tasks[i].getTaskName() + ", ");
			System.out.print(tasks[i].getEnergyCost() + " ");
		}
	}
}
