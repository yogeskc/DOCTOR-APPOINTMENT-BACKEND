package com.springboot.DAO;

import org.springframework.data.repository.CrudRepository;

import com.springboot.Entity.Doctor;


public interface docRepo extends CrudRepository<Doctor, Integer> {

}
