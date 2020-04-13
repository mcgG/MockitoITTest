package util;

public class KafkaConsumer implements IKafka {

  private final static String record = "real kafka record";

  @Override
  public String poll() {
    return record;
  }
}
