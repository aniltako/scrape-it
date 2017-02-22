package scrapeTestCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

@Test
public class ScrapeTest extends BaseTest{
	
	private static final String site = "url";
	
	@Qualifier()//bean name
	@Autowired
//	ScrapeManager scrapeManger;//scrape manager for scraping
	
	
	@Test
	void scrapeUrl() {

	}
	

}
