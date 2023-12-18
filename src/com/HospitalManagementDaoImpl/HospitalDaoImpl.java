package com.HospitalManagementDaoImpl;
import java.util.ArrayList;
import java.util.List;
import com.AppointmentSchedule.Appointment;
import com.DoctorModel.Doctor;
import com.HospitalManagemetDao.HospitalModelDao;
import com.PatientModel.Patient;

public class HospitalDaoImpl 
{
	List<Patient>patients;
	List<Doctor>doctors;
	List<Appointment>appointments;
	
	public HospitalDaoImpl() 
	{
		this.patients =new ArrayList<>();
		this.doctors = new ArrayList<>();
		this.appointments =new ArrayList<>();
	}

	public List<Patient>getPatients()
	{
		return patients;
		
	}
	public List<Doctor>getDoctors()
	{
		return doctors;
		
	}
	public List<Appointment>getAppointments()
	{
		return appointments;
		
	}
	public void addPatient(Patient patient) 
	{
		patients.add(patient);
	}
	public void addDoctors(Doctor doctor) 
	{
		doctors.add(doctor);
		
	}
	public void addAppointments(Appointment appointment) 
	{
		appointments.add(appointment);
	}
	
	
	
}
