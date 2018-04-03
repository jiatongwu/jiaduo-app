package com.wt.jiaduo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
@EnableSpringHttpSession
public class JiaduoApplication {
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
	    CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
	    loggingFilter.setIncludeClientInfo(true);
	    loggingFilter.setIncludeQueryString(true);
	    loggingFilter.setIncludePayload(true);
	    loggingFilter.setIncludeHeaders(true);
	    return loggingFilter;
	}
	


	    @Bean
	    MapSessionRepository sessionRepository() {
	        return new MapSessionRepository();
	    }

	    @Bean
	    HttpSessionStrategy httpSessionStrategy() {
	        return new HeaderHttpSessionStrategy();
	    }


	public static void main(String[] args) {
		SpringApplication.run(JiaduoApplication.class, args);
	}
}
