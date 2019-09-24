package com.school.cc;

import com.github.qcloudsms.httpclient.HTTPClient;
import com.github.qcloudsms.httpclient.HTTPRequest;
import com.github.qcloudsms.httpclient.HTTPResponse;
import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.commons.httpclient.HttpClient;
// import com.example.httpclient.MyHTTPClient
// import com.exmaple.httpclient.MyHTTPRequest
// import com.example.httpclient.MyHTTPresponse
public class CustomHTTPClient implements HTTPClient {

  public HTTPResponse fetch(HTTPRequest request) throws IOException, URISyntaxException {
	 
	
	  
      // 1. 创建自定义 HTTP request
    //   MyHTTPrequest req = MyHTTPRequest.build(request)

      // 2. 创建自定义 HTTP cleint
      // MyHTTPClient client = new MyHTTPClient();

      // 3. 使用自定义 HTTP client 获取 HTTP 响应
      // MyHTTPResponse response = client.fetch(req);

      // 4. 转换 HTTP 响应到 HTTPResponse
      // HTTPResponse res = transformToHTTPResponse(response);

      // 5. 返回 HTTPResponse 实例
       return null;
  }

  public void close() {
      // 如果需要关闭必要资源
  }
}