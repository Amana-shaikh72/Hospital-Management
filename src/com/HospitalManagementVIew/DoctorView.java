package com.HospitalManagementVIew;

import java.util.List;

import com.DoctorModel.Doctor;

public class DoctorView
{
	public void displayDoctorDetails(List<Doctor>doctors) 
	{
		System.out.println("Doctors Details");
		for(Doctor doctor:doctors)
		{
			System.out.println("Name"+doctor.getName());
			System.out.println("specializaion"+doctor.getSpecialization());
			System.out.println("-------------------------------");
		}
	}
}
