import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import model.Task;

public class TaskTest {

  @Test
  public void shouldNotReturnNullTitleWhenGetTask() {
    Task task = new Task("Complete A1 Part 2");

    assertNotNull("Task title should not be null", task.getTitle());
  }

  @Test
  public void shouldNotReturnNullDateWhenGetDate() {
    Task task = new Task("Do School Work");

    assertNotNull("Task alertDate should not be null", task.getAlertDate());
  }

}
