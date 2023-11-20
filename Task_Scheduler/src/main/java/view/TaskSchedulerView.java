package view;

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
        output.println("Enter your choice: ");
        return input.readInt();
    }
}
