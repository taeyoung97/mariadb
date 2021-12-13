package com.example.demo.controller;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MariaService;

@RestController
public class HomeRestController {

	@Autowired MariaService mos;
	
	@PostMapping("/create")
	public void createUser(@RequestBody String requestBody) {
		requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		String password = jsonObject.getString("password");
		
		mos.create(id, password);
	}
	
	@PostMapping("/delete")
	public void deleteUser(@RequestBody String requestBody) {
		requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		
		mos.delete(id);
	}
	
	@PostMapping("/update")
	public void updateUser(@RequestBody String requestBody) throws Exception {
		requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		String password = jsonObject.getString("password");
		
		mos.update(id, password);
	}
}
