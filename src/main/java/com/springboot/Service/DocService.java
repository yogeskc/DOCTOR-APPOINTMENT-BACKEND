package com.springboot.Service;

import java.util.List;

import com.springboot.Entity.Doctor;

public interface DocService {
	
	List<Doctor> FetchAllDoc();

	void saveDoc(Doctor doctor);

	Doctor fetchDoctor(int id);

	void deleteDoc(int id);

}
