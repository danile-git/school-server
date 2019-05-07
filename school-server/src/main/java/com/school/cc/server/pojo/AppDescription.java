package com.school.cc.server.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app")
@Component
public class AppDescription {
	/*
	 * 
#产品描述
#渠道
app.official=official
#应用
app.app-id=ai-lock
#版本
app.version=0.0.1
	 */
	
	
	/**
	 * 集群id
	 * */
	private String id;
	/**
	 * 渠道
	 * */
	private String official;
	/**
	 * 应用
	 * */
	private String appId;
	/**
	 * 版本
	 * */
	private String version;
	/**
	 * 描述
	 * */
	private String desc;

	/**
	 * 在redis里面存储的根key
	 * **/
	private String rootKey;
	
	/**
	 * 删除指纹 或 数据 默认多少秒
	 * */
	private int  delSecond;
	
	/**
	 * 每次传输的字节数
	 * */
	private int pushSize;
	/**
	 * 每次传输的间隔
	 * */
	private int pushDelay;
	/**
	 * 报文最大size
	 * */
	private int pushMax;
	
	/**
	 * #websocket集群广播redis  topic
	 * */
	private String broadcastTopic;
	
	/**
	 * lock-server:server001:data:*  查询 某个服务上  所有存在的key
	 * */
	private String keysPattern;

	/**
	 * #keys的分隔符
	 * */
	private String keysSplit;
	
	/**
	 * #keys的拼接符
	 * */
	private String keysUnion;
	
	/**
	 * 颁发指静脉增长的基数
	 * */
	private int fingervein;
	
	/**
	 * 重试次数
	 * */
	private int retryTimes;
	
	
	/**
	 * 重试次数
	 */
	public int getRetryTimes() {
		return retryTimes;
	}

	/**
	 * 重试次数
	 */
	public void setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
	}

	/**
	 * 颁发指静脉增长的基数
	 */
	public int getFingervein() {
		return fingervein;
	}

	/**
	 * 颁发指静脉增长的基数
	 */
	public void setFingervein(int fingervein) {
		this.fingervein = fingervein;
	}

	/**
	 * 报文最大size
	 */
	public int getPushMax() {
		return pushMax;
	}

	/**
	 * 报文最大size
	 */
	public void setPushMax(int pushMax) {
		this.pushMax = pushMax;
	}

	/**
	 * 集群id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 集群id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 每次传输的间隔
	 */
	public int getPushDelay() {
		return pushDelay;
	}

	/**
	 * 每次传输的间隔
	 */
	public void setPushDelay(int pushDelay) {
		this.pushDelay = pushDelay;
	}
	


	public String getOfficial() {
		return official;
	}

	public void setOfficial(String official) {
		this.official = official;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRootKey() {
		return rootKey;
	}

	public void setRootKey(String rootKey) {
		this.rootKey = rootKey;
	}

	public int getDelSecond() {
		return delSecond;
	}

	public void setDelSecond(int delSecond) {
		this.delSecond = delSecond;
	}

	/**
	 * 每次传输的字节数
	 */
	public int getPushSize() {
		return pushSize;
	}

	/**
	 * 每次传输的字节数
	 */
	public void setPushSize(int pushSize) {
		this.pushSize = pushSize;
	}

	/**
	 * #websocket集群广播redis  topic
	 */
	public String getBroadcastTopic() {
		return broadcastTopic;
	}

	/**
	 * #websocket集群广播redis  topic
	 */
	public void setBroadcastTopic(String broadcastTopic) {
		this.broadcastTopic = broadcastTopic;
	}

	/**
	 * lock-server:server001:data:  查询 某个服务上  所有存在的key
	 */
	public String getKeysPattern() {
		return keysPattern;
	}

	/**
	 * lock-server:server001:data:  查询 某个服务上  所有存在的key
	 */
	public void setKeysPattern(String keysPattern) {
		this.keysPattern = keysPattern;
	}

	/**
	 * #keys的分隔符
	 */
	public String getKeysSplit() {
		return keysSplit;
	}

	/**
	 * #keys的分隔符
	 */
	public void setKeysSplit(String keysSplit) {
		this.keysSplit = keysSplit;
	}

	/**
	 * #keys的拼接符
	 */
	public String getKeysUnion() {
		return keysUnion;
	}

	/**
	 * #keys的拼接符
	 */
	public void setKeysUnion(String keysUnion) {
		this.keysUnion = keysUnion;
	}

}
