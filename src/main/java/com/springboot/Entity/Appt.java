package com.springboot.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appt {
 
	
	@Id
	@GeneratedValue
	int    appt_id;
	String patient_fname; 
	String patient_lname; 
	LocalTime Time = LocalTime.now(); 
	LocalDate Date = LocalDate.now(); 
	String kind; 
	
	
	public Appt() {
		super();
		
	}

	public Appt(int appt_id, String patient_fname, String patient_lname, LocalTime time, LocalDate date, String kind,
			Doctor doc) {
		super();
		this.appt_id = appt_id;
		this.patient_fname = patient_fname;
		this.patient_lname = patient_lname;
		Time = time;
		Date = date;
		this.kind = kind;
		this.doc = doc;
	}
	
	public LocalTime getTime() {
		return Time;
	}

	public void setTime(LocalTime time) {
		Time = time;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}


 	@ManyToOne
 	@JoinColumn(name="id")
	Doctor doc;

	public int getAppt_id() {
		return appt_id;
	}

	public void setAppt_id(int appt_id) {
		this.appt_id = appt_id;
	}

	public String getPatient_fname() {
		return patient_fname;
	}

	public void setPatient_fname(String patient_fname) {
		this.patient_fname = patient_fname;
	}

	public String getPatient_lname() {
		return patient_lname;
	}

	public void setPatient_lname(String patient_lname) {
		this.patient_lname = patient_lname;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Appt [appt_id=" + appt_id + ", patient_fname=" + patient_fname + ", patient_lname=" + patient_lname
				+ ", Time=" + Time + ", Date=" + Date + ", kind=" + kind + ", doc=" + doc + "]";
	}	
}
