package view;

import java.util.List;

import model.Task;

public class TaskSchedulerView {
    private IInput input;
    private IOutput output;

    public TaskSchedulerView(IInput input, IOutput output) {
        this.input = input;
        this.output = output;
    }

    public void showWelcome(String message) {
        if (message == null) {
            throw new NullPointerException();
        }
        
        output.println("\n" + message);
    }

    public void showMenu() {
        output.println("\n1. Add Task");
        output.println("2. View Tasks");
        output.println("3. Remove All Tasks Named ...");
        output.println("0. Exit");
    }

    public int getUserMenuSelection() {
        output.print("\nEnter your choice: ");
        return input.readInt();
    }

    public Task getTaskDetails() {
        output.println("\nEnter Task Details:");
        output.print("Title: ");
        String title = input.readLine();

        output.print("Description: ");
        String description = input.readLine();

        output.print("Alert Date (YYYY-MM-DD): ");
        String date = input.readLine();

        return new Task(title, description, date);
    }

    public String getRemovalDetails() {
        output.print("Enter Task Name: ");
        String taskName = input.readLine();
        return taskName;
    }

    public void showError(String errorMessage) {
        output.println(errorMessage);
    }

    public void showTasks(List<Task> taskList) {
        output.println("\nAll Taks Listed Below ...");
        for (Task task : taskList) {
            output.println(task.getTitle());
        }
        output.println("");
    }
}
