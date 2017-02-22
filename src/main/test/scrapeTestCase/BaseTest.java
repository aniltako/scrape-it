package scrapeTestCase;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.scrape.it.App;
import com.scrape.it.factory.bean.BeanFactory;



@ContextConfiguration(classes={BeanFactory.class,App.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestExecutionListeners(inheritListeners = false, listeners = {
	       DependencyInjectionTestExecutionListener.class,
	       DirtiesContextTestExecutionListener.class })
public class BaseTest extends AbstractTestNGSpringContextTests{
	
}
