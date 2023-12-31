import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    task.setAlertDate("2023-11-25");

    assertNotNull("Task alertDate should not be null", task.getAlertDate());
  }

  @Test
  public void shouldNotReturnNullDescriptionWhenGetDescription() {
    Task task = new Task("Go Out To Eat");
    task.setDescription("Grab some food from Max");

    assertNotNull("Task description should not be null", task.getDescription());
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorWhenTaskWithNullTitle() {
    new Task(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorWhenEmptyTitle() {
    new Task("  ");
  }

  @Test
  public void shouldUpdateTitleWhenSetTitle() {
    Task task = new Task("Old Title");
    task.setTitle("New Title");
    assertEquals("New Title", task.getTitle());
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorWhenSetTitleEmpty() {
    Task task = new Task("Test 1234");
    task.setTitle(" ");
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorWhenSetTitleNull() {
    Task task = new Task("New Test 1234");
    task.setTitle(null);
  }

}
