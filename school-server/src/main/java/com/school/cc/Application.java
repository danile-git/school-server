package com.school.cc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;
import com.school.cc.server.pojo.Env;
import com.school.cc.server.util.ApplicationContextUtil;

@MapperScan("com.school.cc.mapper")
@SpringBootApplication
//@PropertySource(value = { "classpath:status.properties" }, encoding = "UTF-8")
public class Application extends SpringBootServletInitializer {

	@Profile(value = { Env.WAR })
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		ApplicationContextUtil.setApplicationContext(application.context());
		return application.sources(Application.class);
	}

	@Profile(value = { Env.JAR })
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}