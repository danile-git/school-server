package com.school.cc.server.util;

import org.springframework.context.ApplicationContext;

public class ApplicationContextUtil {
	
	private static ApplicationContext applicationContext;

	public static void setApplicationContext(ApplicationContext context) {
		applicationContext = context;
		System.out.println("----------------Set ApplicationContext----------------");
	}

	public static <T> T getBean(Class<T> requiredType) {
		return applicationContext.getBean(requiredType);
	}
}
