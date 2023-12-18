package com.HospitalManagementVIew;

import java.util.List;

import com.AppointmentSchedule.Appointment;

public class AppointmentView 
{
	public void displayAppointmentDetails(List<Appointment>appointments) 
	{
		System.out.println("Appointments Details");
		for(Appointment appointment:appointments) 
		{
			System.out.println("Date"+appointment.getDate());
			System.out.println("Time"+appointment.getTime());
			System.out.println("Patient"+appointment.getPatient());
			System.out.println("Doctor"+appointment.getDoctor());
			System.out.println("-------------------------------");
		}
	}
}
