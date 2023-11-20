import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import model.Task;
import model.TaskManager;

public class TaskManagerTest {

  @Test
  public void shouldReturnEmptyWhenGetTasksEmpty() {
    TaskManager taskManager = new TaskManager();
    List<Task> expected = List.of();
    Assert.assertEquals(expected, taskManager.getTaskList());
  }
}
