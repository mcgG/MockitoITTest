import com.google.inject.Guice;
import com.google.inject.Injector;

public class ServiceMain {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BasicModule());
    ServiceFacade service = injector.getInstance(ServiceFacade.class);
    service.run();
  }
}
