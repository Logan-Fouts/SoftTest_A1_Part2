import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.Task;
import model.TaskManager;

public class TaskManagerTest {

  @Test
  public void shouldReturnEmptyWhenGetTasksEmpty() {
    TaskManager taskManager = new TaskManager();
    List<Task> expected = List.of();
    Assert.assertEquals(expected, taskManager.getTaskList());
  }

  @Test
  public void shouldReturnListWithThreeElementsWhenGetTasks() {
    TaskManager taskManager = new TaskManager();

    Task mockTask1 = Mockito.mock(Task.class);
    Task mockTask2 = Mockito.mock(Task.class);
    Task mockTask3 = Mockito.mock(Task.class);

    taskManager.addTask(mockTask1);
    taskManager.addTask(mockTask2);
    taskManager.addTask(mockTask3);

    List<Task> expected = Arrays.asList(mockTask1, mockTask2, mockTask3);

    Assert.assertEquals(expected, taskManager.getTaskList());
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowIllegalArgErrorWhenAddNullTask() {
    TaskManager taskManager = new TaskManager();

    taskManager.addTask(null);
  }

  @Test
  public void shouldReturnTaskWhenRemoveTaskByTitle() {
    TaskManager taskManager = new TaskManager();

    Task mockTask = Mockito.mock(Task.class);

    String mockTitle = "Some Title";
    Mockito.when(mockTask.getTitle()).thenReturn(mockTitle);

    taskManager.addTask(mockTask);

    List<Task> expected = Arrays.asList(mockTask);

    Assert.assertEquals(expected, taskManager.removeTaskByTitle(mockTask.getTitle()));
  }

  @Test
  public void shouldReturnMultipleTasksWhenRemoveTaskByTitleDuplicates() {
    TaskManager taskManager = new TaskManager();

    Task mockTask = Mockito.mock(Task.class);

    String mockTitle = "Some Title";
    Mockito.when(mockTask.getTitle()).thenReturn(mockTitle);

    taskManager.addTask(mockTask);
    taskManager.addTask(mockTask);

    List<Task> expected = Arrays.asList(mockTask, mockTask);

    Assert.assertEquals(expected, taskManager.removeTaskByTitle(mockTask.getTitle()));
  }

}
