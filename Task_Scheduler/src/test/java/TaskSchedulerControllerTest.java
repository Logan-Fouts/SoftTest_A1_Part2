import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import controller.TaskScheduleController;
import model.TaskManager;
import view.TaskSchedulerView;

public class TaskSchedulerControllerTest {
  @Test
  public void shouldCallGetUserEntryWhenStarted() {
    final int USER_INPUT_TO_EXIT = 0;

    TaskScheduleController controller;
    TaskManager mockTaskManager;
    TaskSchedulerView mockTaskView;

    mockTaskManager = mock(TaskManager.class);
    mockTaskView = mock(TaskSchedulerView.class);
    controller = new TaskScheduleController(mockTaskManager, mockTaskView);

    when(mockTaskView.getUserMenuSelection()).thenReturn(USER_INPUT_TO_EXIT);

    controller.start();

    verify(mockTaskView, atLeastOnce()).getUserMenuSelection();
  }

}
