package com.persistent.location.web.config;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.stereotype.Component;

@Component
public class LocationCoordinates {

	public void ignoreCertificates() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {

		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
	        @Override
	        public X509Certificate[] getAcceptedIssuers() {
	            return null;
	        }

	        @Override
	        public void checkClientTrusted(X509Certificate[] certs, String authType) {
	        }

	        @Override
	        public void checkServerTrusted(X509Certificate[] certs, String authType) {
	        }
	    } };

	    try {
	        SSLContext sc = SSLContext.getInstance("TLS");
	        sc.init(null, trustAllCerts, new SecureRandom());
	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	    } catch (Exception e) {
	    
	    }
	}
}
