package com.springboot.DAO;

import org.springframework.data.repository.CrudRepository;

import com.springboot.Entity.Appt;

public interface apptRepo  extends CrudRepository<Appt, Integer>{

}
