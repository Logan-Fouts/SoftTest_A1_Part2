import org.junit.Assert;
import org.junit.Test;

import model.TaskManager;

public class TaskManagerTest {

  @Test
  public void shouldReturnNullWhenGetTasksEmpty() {
    TaskManager taskManager = new TaskManager();
    Assert.assertEquals(null, taskManager.getTaskList());
  }
}
