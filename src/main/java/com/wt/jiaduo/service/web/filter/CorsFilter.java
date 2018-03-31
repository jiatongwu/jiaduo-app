package com.wt.jiaduo.service.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class CorsFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		HttpServletResponse httpResponse = (HttpServletResponse) arg1;
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
		httpResponse.setHeader("Access-Control-Max-Age", "7200");
		httpResponse.setHeader("Access-Control-Allow-Headers",
				"Origin, X-Requested-With, Content-Type, Accept, Authorization, replace-Authorization");
		httpResponse.setHeader("Access-Control-Expose-Headers", "Authorization, replace-Authorization");
		HttpServletRequest httpRequest = (HttpServletRequest) arg0;
		String method = httpRequest.getMethod();
		if (method.equals("OPTIONS")) {
			httpResponse.setStatus(HttpStatus.OK.value());
			return;
		}
		System.out.println("Authorization: "+httpRequest.getHeader("Authorization"));
		httpResponse.addHeader("replace-Authorization",
				"test-Authorization-Authorization-Authorization-Authorization-Authorization-test");
		arg2.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}