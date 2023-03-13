package com.persistent.location.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.persistent.location.web.model.LocationEntity;
import com.persistent.location.web.service.LocationService;


@RestController
@RequestMapping(path = "coordinates")
@CrossOrigin(origins = "*")
public class LocationController {

	@GetMapping("/getLocation")
	public JsonObject getLocationCoordinates() {
		LocationEntity entity = new RestTemplate().getForObject("https://api.wheretheiss.at/v1/satellites/25544",
				LocationEntity.class);
		
		return service.getLocation(entity);
	}

	@Autowired
	private LocationService service;

}
