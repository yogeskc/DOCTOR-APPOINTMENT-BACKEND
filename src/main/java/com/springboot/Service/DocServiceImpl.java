package com.springboot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.DAO.docRepo;
import com.springboot.Entity.Doctor;

@Service
public class DocServiceImpl implements DocService {

	private docRepo docRep;
	
	@Override
	public List<Doctor> FetchAllDoc() {
		List<Doctor> docc = new ArrayList<>();
		docRep.findAll().forEach(docc::add);
		return docc;
	}

	@Override
	public void saveDoc(Doctor doctor) {
		// Saving Doc Info
		docRep.save(doctor);
		
	}

	@Override
	public Doctor fetchDoctor(int id) {
		//fetchOneDoctor Info
		return docRep.findById(id).get();
	}

	@Override
	public void deleteDoc(int id) {
		// delete
		docRep.deleteById(id);
		
	}

}
