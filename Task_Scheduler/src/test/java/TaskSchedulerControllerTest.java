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

  @Test
  public void shouldCallShowErrorWhenInputError() throws InterruptedException {
    final String ERROR_MESSAGE = "Invalid input, please try again.";
    final int NUM_INVOCATIONS = 1;
    TaskScheduleController controller;
    TaskManager mockTaskManager;
    TaskSchedulerView mockTaskView;

    mockTaskManager = mock(TaskManager.class);
    mockTaskView = mock(TaskSchedulerView.class);
    controller = new TaskScheduleController(mockTaskManager, mockTaskView);

    when(mockTaskView.getUserMenuSelection()).thenReturn(-1);

    controller.start();

    verify(mockTaskView, times(NUM_INVOCATIONS)).showError(ERROR_MESSAGE);
  }

  @Test
  public void shouldRecieveOneWhenEntered() throws InterruptedException {
    final int USER_INPUT = 1;

    TaskScheduleController controller;
    TaskManager mockTaskManager;
    TaskSchedulerView mockTaskView;

    mockTaskManager = mock(TaskManager.class);
    mockTaskView = mock(TaskSchedulerView.class);
    controller = new TaskScheduleController(mockTaskManager, mockTaskView);

    when(mockTaskView.getUserMenuSelection()).thenReturn(USER_INPUT);

    Thread controllerThread = new Thread(() -> controller.start());
    controllerThread.start();

    Thread.sleep(1000);

    controller.stop();
    controllerThread.join();

    verify(mockTaskView, atLeastOnce()).getTaskDetails();
  }

  @Test
  public void shouldSendShowTasksWhenSelected() throws InterruptedException {
    final int USER_INPUT = 2;

    TaskScheduleController controller;
    TaskManager mockTaskManager;
    TaskSchedulerView mockTaskView;

    mockTaskManager = mock(TaskManager.class);
    mockTaskView = mock(TaskSchedulerView.class);
    controller = new TaskScheduleController(mockTaskManager, mockTaskView);

    when(mockTaskView.getUserMenuSelection()).thenReturn(USER_INPUT);

    Thread controllerThread = new Thread(() -> controller.start());
    controllerThread.start();

    // Thread.sleep(1000);

    controller.stop();
    controllerThread.join();

    verify(mockTaskView, atLeastOnce()).showTasks(null);
  }
}
