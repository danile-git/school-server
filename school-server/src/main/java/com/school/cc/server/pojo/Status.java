package com.school.cc.server.pojo;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
@ConfigurationProperties(prefix = "status")
public class Status {
	private Map<String, String> code;

	public Map<String, String> getCode() {
		return code;
	}

	public void setCode(Map<String, String> code) {
		this.code = code;
	}

	public String getCodeInfo(String key) {
		if (code == null || StringUtils.isEmpty(key))
			return null;
		if (this.code.containsKey(key)) {
			return this.code.get(key);
		}
		return null;
	}
}