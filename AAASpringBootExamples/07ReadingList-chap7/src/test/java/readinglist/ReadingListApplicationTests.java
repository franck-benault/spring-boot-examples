package readinglist;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import readinglist.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ReadingListApplicationTests {

	@Test
	public void contextLoads() {
	}

}
