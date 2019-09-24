package com.school.cc;


import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Certificates {

public static HttpClient wrapClient(HttpClient base) {  
    try {  
        SSLContext ctx = SSLContext.getInstance("TLS");  
        X509TrustManager tm = new X509TrustManager() {  
            public X509Certificate[] getAcceptedIssuers() {  
                return null;  
            }  
  
            public void checkClientTrusted(X509Certificate[] arg0,  
                    String arg1) throws CertificateException {  
            }  
  
            public void checkServerTrusted(X509Certificate[] arg0,  
                    String arg1) throws CertificateException {  
            }  
        };  
        ctx.init(null, new TrustManager[] { tm }, null);  
        SSLConnectionSocketFactory ssf = new SSLConnectionSocketFactory(ctx,NoopHostnameVerifier.INSTANCE);  
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(ssf).build();  
        return httpclient;  
    } catch (Exception ex) {  
        ex.printStackTrace();  
        return HttpClients.createDefault();  
    }  
}  
	 public static void trustAllHttpsCertificates() throws Exception {
		 javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
		 javax.net.ssl.TrustManager tm = new miTM();
		 trustAllCerts[0] = tm;
		 javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
		 .getInstance("SSL");
		 sc.init(null, trustAllCerts, null);
		 javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
		 .getSocketFactory());
		 }

		 static class miTM implements javax.net.ssl.TrustManager,
		 javax.net.ssl.X509TrustManager {
		 public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		 return null;
		 }

		 public boolean isServerTrusted(
		 java.security.cert.X509Certificate[] certs) {
		 return true;
		 }

		 public boolean isClientTrusted(
		 java.security.cert.X509Certificate[] certs) {
		 return true;
		 }

		 public void checkServerTrusted(
		 java.security.cert.X509Certificate[] certs, String authType)
		 throws java.security.cert.CertificateException {
		 return;
		 }

		 public void checkClientTrusted(
		 java.security.cert.X509Certificate[] certs, String authType)
		 throws java.security.cert.CertificateException {
		 return;
		 }
		 }
		 
}
