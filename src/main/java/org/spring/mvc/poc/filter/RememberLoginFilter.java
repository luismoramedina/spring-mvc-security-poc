package org.spring.mvc.poc.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class RememberLoginFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		
		System.out.println("3.MyrememberLoginFilter");
		String login = request.getParameter("j_username");
		if(login != null && !login.isEmpty()){
			System.out.println("RememberLoginFilter login: " + login);
			response.addCookie(new Cookie("SPRING_SECURITY_LAST_USERNAME", login));
		}
		filterChain.doFilter(request, response);
	}
	

}
