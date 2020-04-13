import com.google.inject.Inject;
import service.Service;

public class ToBeTestService {

  @Inject
  private Service dynamoService;

  public String listHost() {
    return dynamoService.list();
  }

}
