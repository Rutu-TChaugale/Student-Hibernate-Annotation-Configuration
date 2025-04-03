package com.sit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //recognize the class as a database entity.
@Table(name="Student_annoataion")//change the table name in database
public class Student {
	
	@Id //specify the primary kay
	@GeneratedValue(strategy = GenerationType.AUTO)//for auto increments
	@Column(name="sid") //change the column name in the databse
	private int id;
	
	
	@Column(name="sname")
	private String name;
	
	@Column(name="semail")
	private String email;
	
	@Column(name="saddr")
	private String address;
	
	//getter setter
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//to string 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	

}
