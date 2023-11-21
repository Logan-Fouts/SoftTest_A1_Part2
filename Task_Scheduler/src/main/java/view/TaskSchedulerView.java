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

    public void showMenu() {
        output.println("1. Add Task");
        output.println("2. View Tasks");
        output.println("3. Remove All Tasks Named ...");
        output.println("0. Exit");
    }

    public int getUserMenuSelection() {
        output.print("Enter your choice: ");
        return input.readInt();
    }

    public Task getTaskDetails() {
        output.println("Enter Task Details:");
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
        for (Task task : taskList) {
            output.println(task.getTitle());
        }
    }
}
