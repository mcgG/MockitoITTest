package service;

import com.google.inject.Inject;
import util.IDynamo;

public class DynamoRelatedService {

  @Inject
  private IDynamo dynamo;

  public String insert(String record) {
    return dynamo.insert(record);
  }
}
