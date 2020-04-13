import com.google.inject.AbstractModule;
import service.DynamoService;
import service.Service;

public class BasicModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Service.class).to(DynamoService.class);
  }
}