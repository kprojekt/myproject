package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Restdining;

public interface RestDiningRepository extends CrudRepository<Restdining, Integer> {  

}
