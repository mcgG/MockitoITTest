package service;

import service.Service;

public class DynamoService implements Service {

  private final static String url = "https://this.real.url";

  public String list() {
    return url;
  }
}
