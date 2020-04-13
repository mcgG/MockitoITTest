import com.google.inject.Inject;
import service.DynamoRelatedService;
import service.KafkaRelatedService;

public class ServiceFacade {

  @Inject
  private DynamoRelatedService dynamoRelatedService;

  @Inject
  private KafkaRelatedService kafkaRelatedService;

  public void run() {
    String record = this.kafkaRelatedService.poll();
    dynamoRelatedService.insert(record);
  }
}
