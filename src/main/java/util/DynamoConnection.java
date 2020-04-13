package util;

public class DynamoConnection implements IDynamo {

  @Override
  public String insert(String record) {
    System.out.println("Record from Kafka: " + record + " written to Dynamo");
    return "Record from Kafka: " + record + " written to Dynamo";
  }
}
