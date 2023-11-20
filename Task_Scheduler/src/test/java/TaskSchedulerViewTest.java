import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

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
}