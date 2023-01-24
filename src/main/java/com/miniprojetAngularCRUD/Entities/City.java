package com.miniprojetAngularCRUD.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "SEQ_GEN")
	private Long id;
	private String cityName;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}


	public City(Long id, String cityName) {
		super();
		this.id = id;
		this.cityName = cityName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
	

}
