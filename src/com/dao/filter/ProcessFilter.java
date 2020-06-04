package com.dao.filter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class ProcessFilter implements Filter {
	
	Set<String> allowedResources= new HashSet<>();
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		allowedResources.add("/index.jsp");
		allowedResources.add("/auth");
		allowedResources.add("/dashboard");
	}


	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
	
		HttpServletRequest httpServletRequest=  (HttpServletRequest) req;
					String resourceName=httpServletRequest.getServletPath();
				System.out.println("Hello Welcome to:"+resourceName+" at "+LocalDateTime.now());
				
				if (allowedResources.contains(resourceName)|| resourceName.contains("/img"))
				{
					chain.doFilter(req, resp);	
				}
				else
				{
					HttpSession httpSession=httpServletRequest.getSession(false);
					if (httpSession!=null && httpSession.getAttribute("userData")!=null)
					{
						chain.doFilter(req, resp);
					}
					{
						((HttpServletResponse)resp).sendRedirect(httpServletRequest.getContextPath()+"/"+"index.jsp");
					}
				}
				//it will let the servlets to go inside or accepts request
				/*chain.doFilter(req, resp);
				System.out.println("request is served");*/
	}

}
