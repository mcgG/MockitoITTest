import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

public class ServiceFacadeTest {

  private ServiceFacade serviceFacade;

  @Before
  public void init() {
    Injector injector = Guice.createInjector(new MockModule());
    this.serviceFacade = injector.getInstance(ServiceFacade.class);
  }

  @Test
  public void run() {
    serviceFacade.run();
  }
}
