package org.isaiahjenkins;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * ServletInitializer that helps build a war file.
 */
public class ServletInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(StoreApplication.class);
	}
}
