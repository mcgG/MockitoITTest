import com.google.inject.Guice;
import com.google.inject.Injector;
import mock.MockModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MockTest {

  ToBeTestService toBeTestService;

  @Before
  public void init() {
    Injector injector = Guice.createInjector(new MockModule());
    toBeTestService = injector.getInstance(ToBeTestService.class);
  }

  @Test
  public void testList() {
    Assert.assertEquals("https://this.mock.url", toBeTestService.listHost());
  }

}
