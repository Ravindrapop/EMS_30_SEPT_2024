package com.rsg.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="Age")
	private int age;
	@Column(name="Education")
	private String education;
	@Column(name="Department")
	private String department;
	@Column(name="Salary")
	private double salary;
	@Column(name="Contact")
	private String contact;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="DateOfJoining")
	private LocalDate dateOfJoining;
	@Column(name="Designation")
	private String designation;
	@Column(name="Address")
	private String address;
	
	public Employee(Integer id, String firstName, String lastName, int age, String education, String department,
			double salary, String contact, LocalDate dateOfJoining, String designation, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.education = education;
		this.department = department;
		this.salary = salary;
		this.contact = contact;
		this.dateOfJoining = dateOfJoining;
		this.designation = designation;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", education=" + education + ", department=" + department + ", salary=" + salary + ", contact="
				+ contact + ", dateOfJoining=" + dateOfJoining + ", designation=" + designation + ", address=" + address
				+ "]";
	}
	

}
