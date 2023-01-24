package com.miniprojetAngularCRUD.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.miniprojetAngularCRUD.Entities.City;
import com.miniprojetAngularCRUD.Respository.CityRepository;

public class CityServiceImpl implements CityService {

	
	@Autowired
	CityRepository cityRepository;
	
	@Override
	public List<City> getCities() {
		return cityRepository.findAll();
	}
	



}
