package com.scrape.it.factory;

import com.scrape.it.service.scraper.ScrapeType;

public interface ScrapeManagerFactory {

	public ScrapeManagerFactory getParseManager(ScrapeType siteType);
}
