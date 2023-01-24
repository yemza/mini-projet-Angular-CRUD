package com.miniprojetAngularCRUD.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojetAngularCRUD.Entities.City;
import com.miniprojetAngularCRUD.Services.CityService;

@CrossOrigin("*")
@RestController
public class CityControle {

	@Autowired
	CityService cityService;
	
	
	
	@GetMapping("/getCities")
	public List<City> getCities() {
		return cityService.getCities();
	}
	

}
