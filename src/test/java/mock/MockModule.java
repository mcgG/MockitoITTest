package mock;

import com.google.inject.AbstractModule;
import mock.service.MockDynamoService;
import service.Service;

public class MockModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Service.class).to(MockDynamoService.class);
  }
}