import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import model.Task;
import view.IInput;
import view.IOutput;
import view.TaskSchedulerView;

public class TaskSchedulerViewTest {
  @Test
  public void shouldShowOutputMenueWhenCalled() {
    IInput mockInput;
    IOutput mockOutput;
    TaskSchedulerView taskView;

    mockInput = mock(IInput.class);
    mockOutput = mock(IOutput.class);
    taskView = new TaskSchedulerView(mockInput, mockOutput);

    taskView.showMenu();
    verify(mockOutput, times(1)).println("1. Add Task");
    verify(mockOutput, times(1)).println("2. View Tasks");
    verify(mockOutput, times(1)).println("3. Remove All Tasks Named ...");
    verify(mockOutput, times(1)).println("0. Exit");
  }

  @Test
  public void shouldReturnOneWhenEnteredInMenue() {
    final int USER_SELECTION = 1;

    IInput mockInput;
    IOutput mockOutput;
    TaskSchedulerView taskView;

    mockInput = mock(IInput.class);
    mockOutput = mock(IOutput.class);
    taskView = new TaskSchedulerView(mockInput, mockOutput);

    Mockito.when(mockInput.readInt()).thenReturn(USER_SELECTION);

    assertEquals(USER_SELECTION, taskView.getUserMenuSelection());
  }

  @Test
  public void shouldAllowUserDataEntryWhenGetTaskDetails() {
    TaskSchedulerView view;
    IInput mockInput;
    IOutput mockOutput;

    mockInput = mock(IInput.class);
    mockOutput = mock(IOutput.class);
    view = new TaskSchedulerView(mockInput, mockOutput);

    when(mockInput.readLine()).thenReturn("Test Task", "Test Description", "2023-12-31");

    // Act: Call the method under test
    Task result = view.getTaskDetails();

    assertEquals("Test Task", result.getTitle());
    assertEquals("Test Description", result.getDescription());
    assertEquals("2023-12-31", result.getAlertDate().toString());
}
}
