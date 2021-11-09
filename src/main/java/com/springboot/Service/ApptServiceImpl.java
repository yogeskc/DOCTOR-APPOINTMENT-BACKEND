package com.springboot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.DAO.apptRepo;
import com.springboot.Entity.Appt;

@Service
public class ApptServiceImpl implements ApptService {

	@Autowired
	private apptRepo aptRep; 
	
	
	
	@Override
	public List<Appt> FetchAll() {
		// fetching all Topics
		
		List<Appt> appts = new ArrayList<>();
		aptRep.findAll().forEach(appts::add);
		return appts;
	}

	@Override
	public void saveAppt(Appt appt) {
		//saving Appointment
		aptRep.save(appt);
		
	}

	@Override
	public Appt fetchAppt(int id) {
		// fetchOne Appt
		return aptRep.findById(id).get();
		
	}

	@Override
	public void deleteAppt(int id) {
		// deleting appt
		 aptRep.deleteById(id);
		
	}

}
