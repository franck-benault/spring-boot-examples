package readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import readinglist.ReadingListApplication;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ReadingListApplication.class , webEnvironment=WebEnvironment.RANDOM_PORT)
//@WebIntegrationTest(randomPort=true)
public class ServerWebTest {
  
  @Value("${local.server.port}")
  private int port;
  
  @Test
  public void testSomething() throws Exception {
    System.out.println("port ="+port);
    RestTemplate test = new RestTemplate();
    String s = test.getForObject("http://localhost:{port}", String.class, port);
    System.out.println(s);
  }

}
