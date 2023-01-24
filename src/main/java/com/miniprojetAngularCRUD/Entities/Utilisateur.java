package com.miniprojetAngularCRUD.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "SEQ_GEN")
	private Long id;
	
	private String firstName;
	
	private String lastName;

	private String email;

	private String userName;

	private Date birthDate;

	@OneToOne
	@JoinColumn( name="id_city" )
	private City city; 
	
	private String country;
	
public Utilisateur() {
	// TODO Auto-generated constructor stub
}

public Utilisateur(Long id, String firstName, String lastName, String email, String userName, Date birthDate, City city,
		String country) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.userName = userName;
	this.birthDate = birthDate;
	this.city = city;
	this.country = country;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	birthDate = birthDate;
}

public City getCity() {
	return city;
}

public void setCity(City city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	country = country;
}


}
