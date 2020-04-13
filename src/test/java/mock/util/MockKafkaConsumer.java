package mock.util;

import util.IKafka;

public class MockKafkaConsumer implements IKafka {

  private final static String record = "mocked kafka record";

  @Override
  public String poll() {
    return record;
  }
}
