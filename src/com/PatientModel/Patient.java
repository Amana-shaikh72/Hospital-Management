package com.PatientModel;

public class Patient 
{
	private String name;
	private int age;
	private String MobNo;
	private String address;
	public Patient(String name, int age, String mobNo, String address)
	{
		this.name = name;
		this.age = age;
		this.MobNo = mobNo;
		this.address = address;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getMobNo()
	{
		return MobNo;
	}
	public void setMobNo(String mobNo) 
	{
		MobNo = mobNo;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	
	
}
