package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
  private List<Task> taskList;

  public TaskManager() {
    this.taskList = new ArrayList<>();
  }

  /**
   * Returns a list of the tasks.
   * 
   * @return An unmodifiable list of all tasks.
   */
  public List<Task> getTaskList() {
    return Collections.unmodifiableList(taskList);
  }

  public void addTask(Task givenTask) {
    if (givenTask == null) {
      throw new IllegalArgumentException("A Task cannot be null");
    }
    
    this.taskList.add(givenTask); 
  } 
}
