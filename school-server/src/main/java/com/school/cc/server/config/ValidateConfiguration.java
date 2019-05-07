package com.school.cc.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.school.cc.server.interceptor.ValidateInterceptor;

//@Configuration
public class ValidateConfiguration implements WebMvcConfigurer {

	/**
	 * 自己定义的拦截器类
	 * 
	 * @return
	 */
	@Bean
	ValidateInterceptor validateInterceptor() {
		return new ValidateInterceptor();
	}

	/**
	 * 添加拦截器
	 * 
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(validateInterceptor()).addPathPatterns("/**");
	}

}
