package com.persistent.location.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "location")
public class LocationPropertyConfig {

	public String getLatitude() {  return latitude;  }

	public void setLatitude(String latitude) {  this.latitude = latitude;  }

	public String getLongitude() {  return longitude;  }

	public void setLongitude(String longitude) {  this.longitude = longitude;  }
	
	private String latitude;

	private String longitude;

}
