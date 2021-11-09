package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.DAO.apptRepo;
import com.springboot.DAO.docRepo;
import com.springboot.Entity.Appt;
import com.springboot.Entity.Doctor;
import com.springboot.Service.ApptService;

@RestController()
public class apeController {

	@Autowired
	docRepo docRep;
	
	@Autowired
	ApptService apptRep;
	
	
	@GetMapping("/")
	public String demo() {
		return "Welcome To Appointment System"; 
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAllDocs(){
		return (List<Doctor>) docRep.findAll();
	}
	
	@GetMapping("appt")
	public List<Appt> getAllAppt(){
		return (List<Appt>) apptRep.FetchAll();
	}
	
	@PostMapping("/appt")
	public String saveAppt(@ModelAttribute Appt appt) {
		//saving Appointment
	   apptRep.saveAppt(appt);
	 return "redirect:appt";		
	}
	
	@GetMapping("/appt/delete")
	String deleteAppt(@RequestParam int appt_id) {
		apptRep.deleteAppt(appt_id);
		return "redirect:appt";
	}
	
	
	
	
}