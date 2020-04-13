package service;

import com.google.inject.Inject;
import util.IKafka;

public class KafkaRelatedService {

  @Inject
  private IKafka consumer;

  public String poll() {
    return consumer.poll();
  }
}
