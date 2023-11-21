package controller;

import model.Task;
import model.TaskManager;
import view.TaskSchedulerView;

public class TaskScheduleController {
  private TaskManager taskManager;
  private TaskSchedulerView taskView;
  private boolean running = true;

  public TaskScheduleController(TaskManager taskManager, TaskSchedulerView taskView) {
    this.taskManager = taskManager;
    this.taskView = taskView;
  }

  public void start() {
    while (running) {
      taskView.showMenu();
      int choice = taskView.getUserMenuSelection();
      switch (choice) {
        case 0:
          running = false;
          break;
        case 1:
          Task taskToAdd = taskView.getTaskDetails();
          break;
        case 2:
          taskView.showTasks(taskManager.getTaskList());
          break;
        default:
          taskView.showError("Invalid input, please try again.");
          running = false;
          break;
      }
    }
  }

  public void stop() {
    running = false;
  }
}
