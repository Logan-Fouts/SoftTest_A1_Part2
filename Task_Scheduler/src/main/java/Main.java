import controller.TaskScheduleController;
import model.TaskManager;
import view.ConsoleInput;
import view.ConsoleOutput;
import view.TaskSchedulerView;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskSchedulerView view = new TaskSchedulerView(new ConsoleInput(), new ConsoleOutput());
        TaskScheduleController controller = new TaskScheduleController(taskManager, view);

        controller.start();
    }
}
