package com.springboot.Service;

import java.util.List;

import com.springboot.Entity.Appt;



public interface ApptService {
	List<Appt> FetchAll();

	void saveAppt(Appt appt);

	Appt fetchAppt(int id);

	void deleteAppt(int id);

	
	
}
