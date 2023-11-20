package controller;

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
      }
    }
  }
}
