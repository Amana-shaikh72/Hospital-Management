package com.HospitalManagementVIew;
import java.util.List;
import com.PatientModel.Patient;

public class PatientView
{
	public void displayPatientDetails(List<Patient>patients) 
	{
		System.out.println("Patients Details");
		for(Patient patient:patients)
		{
			System.out.println("Name"+ patient.getName());
			System.out.println("Age"+ patient.getAge());
			System.out.println("Mobile NO"+patient.getMobNo());
			System.out.println("Address"+patient.getAddress());
			System.out.println("------------------------------");
		}
		
	}
}
