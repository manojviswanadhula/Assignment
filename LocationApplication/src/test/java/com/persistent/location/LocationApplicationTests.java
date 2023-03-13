package com.persistent.location;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.persistent.location.web.config.LocationPropertyConfig;
import com.persistent.location.web.model.LocationEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationApplicationTests {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	private LocationPropertyConfig properties;
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Before
	public void setUp()
	{
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void addUserTest() throws Exception {
	JsonObject json = new JsonObject();
	json.addProperty("latitude", properties.getLatitude());
	json.addProperty("longitude", properties.getLongitude());
	
	String JsonRequest = objectMapper.writeValueAsString(json);
	
	MvcResult result = mockMvc.perform(get("/coordinates/getLocation").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(status().isOk()).andReturn();
	
	String resultContext = result.getResponse().getContentAsString();
	
	LocationEntity response = objectMapper.readValue(resultContext, LocationEntity.class);
		
	}
}