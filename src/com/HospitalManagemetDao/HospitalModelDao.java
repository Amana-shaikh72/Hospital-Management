package com.HospitalManagemetDao;

import java.util.List;
import com.AppointmentSchedule.Appointment;
import com.DoctorModel.Doctor;
import com.PatientModel.Patient;

public interface HospitalModelDao 
{
	public List<Patient>getPatients();
	public List<Doctor>getDoctors();
	public List<Appointment>getAppointments();
	public void addPatients(Patient patient);
	public void addDoctors(Doctor doctor);
	public void addAppointments(Appointment appointment);
	
}
