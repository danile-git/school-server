package com.school.cc;


import com.github.qcloudsms.httpclient.HTTPClient;
import com.github.qcloudsms.httpclient.HTTPException;
import com.github.qcloudsms.httpclient.HTTPMethod;
import com.github.qcloudsms.httpclient.HTTPRequest;
import com.github.qcloudsms.httpclient.HTTPResponse;
import com.github.qcloudsms.SmsSenderUtil;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.DefaultHTTPClient;

import org.json.JSONObject;
import org.json.JSONException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;


public class SmsSingleSender extends SmsBase {

    private String url = "https://yun.tim.qq.com/v5/tlssmssvr/sendsms";

    public SmsSingleSender(int appid, String appkey) {
        super(appid, appkey, new DefaultHTTPClient());
    }

    public SmsSingleSender(int appid, String appkey, HTTPClient httpclient) {
        super(appid, appkey, httpclient);
    }

    /**
     * 鏅�氬崟鍙�
     *
     * 鏅�氬崟鍙戠煭淇℃帴鍙ｏ紝鏄庣‘鎸囧畾鍐呭锛屽鏋滄湁澶氫釜绛惧悕锛岃鍦ㄥ唴瀹逛腑浠ャ�愩�戠殑鏂瑰紡娣诲姞鍒颁俊鎭唴瀹逛腑锛屽惁鍒欑郴缁熷皢浣跨敤榛樿绛惧悕
     *
     * @param type 鐭俊绫诲瀷锛�0 涓烘櫘閫氱煭淇★紝1 钀ラ攢鐭俊
     * @param nationCode 鍥藉鐮侊紝濡� 86 涓轰腑鍥�
     * @param phoneNumber 涓嶅甫鍥藉鐮佺殑鎵嬫満鍙�
     * @param msg 淇℃伅鍐呭锛屽繀椤讳笌鐢宠鐨勬ā鏉挎牸寮忎竴鑷达紝鍚﹀垯灏嗚繑鍥為敊璇�
     * @param extend 鎵╁睍鐮侊紝鍙～绌�
     * @param ext 鏈嶅姟绔師鏍疯繑鍥炵殑鍙傛暟锛屽彲濉┖
     * @return {@link}SmsSingleSenderResult
     * @throws HTTPException  http status exception
     * @throws JSONException  json parse exception
     * @throws IOException    network problem
     */
    public SmsSingleSenderResult send(int type, String nationCode, String phoneNumber,
        String msg, String extend, String ext)
            throws HTTPException, JSONException, IOException {

        long random = SmsSenderUtil.getRandom();
        long now = SmsSenderUtil.getCurrentTime();
        JSONObject body = new JSONObject()
            .put("tel", (new JSONObject()).put("nationcode", nationCode).put("mobile", phoneNumber))
            .put("type", type)
            .put("msg", msg)
            .put("sig", SmsSenderUtil.calculateSignature(this.appkey, random, now, phoneNumber))
            .put("time", now)
            .put("extend", SmsSenderUtil.isNotEmpty(extend) ? extend : "")
            .put("ext", SmsSenderUtil.isNotEmpty(ext) ? ext : "");

        HTTPRequest req = new HTTPRequest(HTTPMethod.POST, this.url)
            .addHeader("Conetent-Type", "application/json")
            .addQueryParameter("sdkappid", this.appid)
            .addQueryParameter("random", random)
            .setConnectionTimeout(60 * 1000)
            .setRequestTimeout(60 * 1000)
            .setBody(body.toString());

        // TODO Handle timeout exception
        try {
            // May throw IOException and URISyntaxexception
            HTTPResponse res = httpclient.fetch(req);

            // May throw HTTPException
            handleError(res);

            // May throw JSONException
            return (new SmsSingleSenderResult()).parseFromHTTPResponse(res);
        } catch(URISyntaxException e) {
            throw new RuntimeException("API url has been modified, current url: " + url);
        }
    }

    /**
     * 鎸囧畾妯℃澘鍗曞彂
     *
     * @param nationCode 鍥藉鐮侊紝濡� 86 涓轰腑鍥�
     * @param phoneNumber 涓嶅甫鍥藉鐮佺殑鎵嬫満鍙�
     * @param templateId 淇℃伅鍐呭
     * @param params 妯℃澘鍙傛暟鍒楄〃锛屽妯℃澘 {1}...{2}...{3}锛岄偅涔堥渶瑕佸甫涓変釜鍙傛暟
     * @param sign 绛惧悕锛屽鏋滃～绌猴紝绯荤粺浼氫娇鐢ㄩ粯璁ょ鍚�
     * @param extend 鎵╁睍鐮侊紝鍙～绌�
     * @param ext 鏈嶅姟绔師鏍疯繑鍥炵殑鍙傛暟锛屽彲濉┖
     * @return {@link}SmsSingleSenderResult
     * @throws HTTPException  http status exception
     * @throws JSONException  json parse exception
     * @throws IOException    network problem
     */
    public SmsSingleSenderResult sendWithParam(String nationCode, String phoneNumber, int templateId,
        ArrayList<String> params, String sign, String extend, String ext)
            throws HTTPException, JSONException, IOException {

        long random = SmsSenderUtil.getRandom();
        long now = SmsSenderUtil.getCurrentTime();

        JSONObject body = new JSONObject()
            .put("tel", (new JSONObject()).put("nationcode", nationCode).put("mobile", phoneNumber))
            .put("sig", SmsSenderUtil.calculateSignature(appkey, random, now, phoneNumber))
            .put("tpl_id", templateId)
            .put("params", params)
            .put("sign", sign)
            .put("time", now)
            .put("extend", SmsSenderUtil.isNotEmpty(extend) ? extend : "")
            .put("ext", SmsSenderUtil.isNotEmpty(ext) ? ext : "");

        HTTPRequest req = new HTTPRequest(HTTPMethod.POST, this.url)
            .addHeader("Conetent-Type", "application/json")
            .addQueryParameter("sdkappid", this.appid)
            .addQueryParameter("random", random)
            .setConnectionTimeout(60 * 1000)
            .setRequestTimeout(60 * 1000)
            .setBody(body.toString());

        try {
            // May throw IOException and URISyntaxexception
            HTTPResponse res = httpclient.fetch(req);

            // May throw HTTPException
            handleError(res);

            // May throw JSONException
            return (new SmsSingleSenderResult()).parseFromHTTPResponse(res);
        } catch(URISyntaxException e) {
            throw new RuntimeException("API url has been modified, current url: " + url);
        }
    }

    public SmsSingleSenderResult sendWithParam(String nationCode, String phoneNumber, int templateId,
        String[] params, String sign, String extend, String ext)
            throws HTTPException, JSONException, IOException {

        return sendWithParam(nationCode, phoneNumber, templateId,
            new ArrayList<String>(Arrays.asList(params)), sign, extend, ext);
    }
}
