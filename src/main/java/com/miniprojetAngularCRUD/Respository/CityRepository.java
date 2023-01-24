package com.miniprojetAngularCRUD.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojetAngularCRUD.Entities.City;

public interface CityRepository  extends JpaRepository<City, Long> {


}
