package com.AppointmentSchedule;

import java.util.Date;

import com.DoctorModel.Doctor;
import com.PatientModel.Patient;

public class Appointment 
{
	private Date date;
	private int time;
	private Patient patient;
	private Doctor doctor;
	
	public Appointment(Date date, int time, Patient patient, Doctor doctor) 
	{
		this.date = date;
		this.time = time;
		this.patient = patient;
		this.doctor = doctor;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public int getTime() 
	{
		return time;
	}
	public void setTime(int time) 
	{
		this.time = time;
	}
	public Patient getPatient() 
	{
		return patient;
	}
	public void setPatient(Patient patient) 
	{
		this.patient = patient;
	}
	public Doctor getDoctor() 
	{
		return doctor;
	}
	public void setDoctor(Doctor doctor)
	{
		this.doctor = doctor;
	}
	
}
