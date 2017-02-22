package utils;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;

public abstract class ScrapeUtils {
	
	public static Document getDocument(String url) {

		Document doc = null;
		try {
			Response response = Jsoup
					.connect(url)
					.ignoreContentType(true)
					.userAgent(
							"Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.106 Safari/537.36")
					.referrer("http://www.google.com").timeout(12000)
					.followRedirects(true).execute();

			doc = response.parse();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return doc;
	}
}
