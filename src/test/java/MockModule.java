import com.google.inject.AbstractModule;
import mock.util.MockDynameConnection;
import mock.util.MockKafkaConsumer;
import util.IDynamo;
import util.IKafka;

public class MockModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(IDynamo.class).to(MockDynameConnection.class);
    bind(IKafka.class).to(MockKafkaConsumer.class);
  }
}
