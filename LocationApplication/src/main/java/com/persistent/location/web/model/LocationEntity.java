package com.persistent.location.web.model;

import org.springframework.stereotype.Component;

@Component
public class LocationEntity {
	
	public String getName() {   return name;   }
	
	public void setName(String name) {  this.name = name;  }
	
	public Long getId() {  return id;  }
	
	public void setId(Long id) {   this.id = id;   }
	
	public Double getLatitude() {   return latitude;   }
	
	public void setLatitude(Double latitude) {   this.latitude = latitude;   }
	
	public Double getLongitude() {   return longitude;   }
	
	public void setLongitude(Double longitude) {   this.longitude = longitude;   }
	
	public Double getAltitude() {   return altitude;   }
	
	public void setAltitude(Double altitude) {   this.altitude = altitude;   }	
	
	public Double getVelocity() {   return velocity;   }
	
	public void setVelocity(Double velocity) {   this.velocity = velocity;   }
	
	public String getVisibility() {   return visibility;   }
	
	public void setVisibility(String visibility) {   this.visibility = visibility;   }
	
	public Double getFootPrint() {   return footPrint;   }
	
	public void setFootPrint(Double footPrint) {   this.footPrint = footPrint;   }
	
	public Double getTimeStamp() {   return timeStamp;   }
	
	public void setTimeStamp(Double timeStamp) {   this.timeStamp = timeStamp;   }
	
	public Double getDayNum() {   return dayNum;   }
	
	public void setDayNum(Double dayNum) {   this.dayNum = dayNum;}
	
	public Double getSolar_lat() {   return solar_lat;   }
	
	public void setSolar_lat(Double solar_lat) {   this.solar_lat = solar_lat;   }
	
	public Double getSolar_lon() {   return solar_lon;   }
	
	public void setSolar_lon(Double solar_lon) {   this.solar_lon = solar_lon;   }
	
	public String getUnits() {   return units;   }
	
	public void setUnits(String units) {   this.units = units;   }
	
	private String name;
	
	private Long id;
	
	private Double latitude;
	
	private Double longitude;
	
	private Double altitude;
	
	private Double velocity;
	
	private String visibility;
	
	private Double footPrint;
	
	private Double timeStamp;
	
	private Double dayNum;
	
	private Double solar_lat;
	
	private Double solar_lon;
	
	private String units;

}
