package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

  /**
   * Removes ALL Tasks that have a matching title.
   * 
   * @param givenTaskTitle
   * @return Most recently removed Task object
   */
  public List<Task> removeTaskByTitle(String givenTaskTitle) {
    List<Task> tmpTaskList = new ArrayList<>();
    Iterator<Task> taskListIterator = taskList.iterator();

    while (taskListIterator.hasNext()) {
        Task task = taskListIterator.next();
        if (task.getTitle().equals(givenTaskTitle)) {
            tmpTaskList.add(task);
            taskListIterator.remove();
        }
    }

    return tmpTaskList;
}

}
