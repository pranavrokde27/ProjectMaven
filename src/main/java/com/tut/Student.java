package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //(name="Students_Details")
public class Student{
	
	@Id
	private int id;
	
	private String name;
	private String city;
	
	private Certificate certificate;
	
	//Constructor
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getter-Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	//Getter-Setter
	
	@Override
	public String toString() {
	    return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	

}
