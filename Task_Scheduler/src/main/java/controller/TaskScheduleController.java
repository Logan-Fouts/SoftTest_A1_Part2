package controller;

import model.Task;
import model.TaskManager;
import view.TaskSchedulerView;

public class TaskScheduleController {
  private TaskManager taskManager;
  private TaskSchedulerView taskView;

  public TaskScheduleController(TaskManager taskManager, TaskSchedulerView taskView) {
    this.taskManager = taskManager;
    this.taskView = taskView;
  }

  public void start() {
    boolean running = true;
    while (running) {
      int choice = taskView.getUserMenuSelection();
      switch (choice) {
        case 0:
          running = false;
          break;
        case 1:
          Task taskToAdd = taskView.getTaskDetails();
          running = false;
          break;
        default:
          taskView.showError("Invalid input, please try again.");
          running = false;
          break;
      }
    }
  }
}
