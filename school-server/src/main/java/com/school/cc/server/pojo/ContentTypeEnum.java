package com.school.cc.server.pojo;

public enum ContentTypeEnum {
	/**
	 * json
	 */
	APPLICATION_JSON("application/json;charset=UTF-8"),
	/**
	 * 文件流
	 */
    APPLICATION_STREAM("application/octet-stream"),
	/**
	 * 文本
	 */
	TEXT_PLAIN("text/plain;charset=UTF-8"),
	/**
	 * 图片
	 * */
	IMAGE_JPEG("image/Jpeg");
	private String value;

	private ContentTypeEnum(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value.toString();
	}

	public String getContentType() {
		// TODO Auto-generated method stub
		return this.value;
	}
}
