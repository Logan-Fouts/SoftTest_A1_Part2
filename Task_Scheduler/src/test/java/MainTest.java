import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {

  @Test
  public void testNormal() {
    Main main = new Main();

    Assert.assertEquals("Hello", main.Greet());
  }

  @Test
  public void testMock() {
    Main mockMain = mock(Main.class);

    when(mockMain.Greet()).thenReturn("Hello");

    Assert.assertEquals("Hello", mockMain.Greet());
  }

}
