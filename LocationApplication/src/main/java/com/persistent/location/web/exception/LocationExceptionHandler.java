package com.persistent.location.web.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.JsonObject;
import com.persistent.location.web.config.LocationPropertyConfig;

@ControllerAdvice
public class LocationExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> exception(Exception exception) {
		JsonObject json = new JsonObject();
		json.addProperty("latitude", properties.getLatitude());
		json.addProperty("longitude", properties.getLongitude());
		
		return new ResponseEntity<>(json.toString(), HttpStatus.NOT_FOUND);
	}

	@Autowired
	private LocationPropertyConfig properties;
}
