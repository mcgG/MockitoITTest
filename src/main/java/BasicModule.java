import com.google.inject.AbstractModule;
import util.DynamoConnection;
import util.IDynamo;
import util.IKafka;
import util.KafkaConsumer;

public class BasicModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(IDynamo.class).to(DynamoConnection.class);
    bind(IKafka.class).to(KafkaConsumer.class);
  }
}