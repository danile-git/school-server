package com.school.cc.server.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * Web相关工具类
 */
public class WebUtil {

	/**
	 * 发起http get请求
	 */
	public static String doGet(String requestUrl) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		String responseContent = null;
		String result = null;

		try {
			HttpGet httpGet = new HttpGet(requestUrl);
			response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			responseContent = EntityUtils.toString(entity, "UTF-8");
			result = responseContent;
		} catch (IOException e) {
			System.out.println("HTTP请求异常：" + e.getMessage());
		}

		return result;
	}

	private static String charset = "utf-8";
	private static HttpClient httpClient = HttpClients.createDefault();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String doPost(String url, Map<String, String> map, Map<String, String> header) {
		HttpPost httpPost = null;
		String result = null;
		try {
			httpPost = new HttpPost(url);
			if (header != null) {
				for (String key : header.keySet()) {
					httpPost.addHeader(key, header.get(key));
				}

			}
			// 设置参数
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			Iterator iterator = map.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, String> elem = (Entry<String, String>) iterator.next();
				list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
			}
			if (list.size() > 0) {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
				httpPost.setEntity(entity);
			}
			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, charset);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}