package com.persistent.location.web.service;

import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.persistent.location.web.model.LocationEntity;

@Service
public class LocationService {

	public JsonObject getLocation(LocationEntity entity) {

		JsonObject json = new JsonObject();

		if (entity != null) {
			json.addProperty("latitude", entity.getLatitude());
			json.addProperty("longitude", entity.getLongitude());
			return json;
		} 
		else {
			return null;
		}

	}
}
