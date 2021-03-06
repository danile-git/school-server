package com.school.cc;
import org.json.JSONException;

import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

import java.io.IOException;
public class CmsTest {
	// 短信应用 SDK AppID
	private static final int appid = 1400258204; // SDK AppID 以1400开头
	// 短信应用 SDK AppKey
	private static final String appkey = "cd91d0e7f433f08a6c0a706eebc53590";
	
	// 短信模板 ID，需要在短信应用中申请
	private static final int templateId = 428178; // NOTE: 这里的模板 ID`7839`只是示例，真实的模板 ID 需要在短信控制台中申请
	// 签名
	private static final String smsSign = "橘子树英语"; // NOTE: 签名参数使用的是`签名内容`，而不是`签名ID`。这里的签名"腾讯云"只是示例，真实的签名需要在短信控制台申请

	public static void main(String[] args) {
		// 需要发送短信的手机号码
		String[] phoneNumbers = { "13031033810" };
		try {
			  String[] params = {"cc英语","5678","5"};
			
			  SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
			  SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
			      templateId, params, smsSign, "", "");
			  System.out.println(result);
			} catch (HTTPException e) {
			  // HTTP 响应码错误
			  e.printStackTrace();
			} catch (JSONException e) {
			  // JSON 解析错误
			  e.printStackTrace();
			} catch (IOException e) {
			  // 网络 IO 错误
			  e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//		String info = null;  
//        try{  
//            HttpClient httpclient = new HttpClient();//方法调用  
//            
//            PostMethod post = new PostMethod("http://192.168.1.99:8088/sms/sendCode");//接口地址  
//            
//            post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");//格式转换  
//            
//            post.addParameter("signName", );
//            post.addParameter("templateCode", "SMS_114600059");
//            post.addParameter("expireTime", "300");
//            post.addParameter("count", "4");
//            post.addParameter("bizId", "learn");
//            post.addParameter("phoneNumbers",phoneNumbers[0]);
//            
//            httpclient.executeMethod(post);  
//            info = new String(post.getResponseBody(),"UTF-8"); 
//            mav.addObject("apimsg",info);
//        }catch (Exception e) {  
//            e.printStackTrace();  
//        }  
	}
}
