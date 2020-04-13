package mock.util;

import util.IDynamo;

public class MockDynameConnection implements IDynamo {

  @Override
  public String insert(String record) {
    System.out.println("[Mocked] Record from Kafka: " + record + " written to Dynamo");
    return "[Mocked] Record from Kafka: " + record + " written to Dynamo";
  }
}
