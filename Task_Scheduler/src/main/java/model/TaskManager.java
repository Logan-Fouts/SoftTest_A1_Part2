package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
  List<Task> taskList;

  public TaskManager() {
    this.taskList = new ArrayList<>();
  }

  public List<Task> getTaskList() {
    return Collections.unmodifiableList(taskList);
  }

  public void addTask(Task givenTask) {
    this.taskList.add(givenTask);
  } 
}
