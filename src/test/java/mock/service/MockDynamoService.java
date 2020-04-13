package mock.service;

import service.Service;

public class MockDynamoService implements Service {

  private final static String url = "https://this.mock.url";

  public String list() {
    return url;
  }
}
