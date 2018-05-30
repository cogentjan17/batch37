package com.saran.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.Id;
import javax.persistence.Table;
//This is comment
@Entity
@Table(name="emp_hibernate3")
public class Employee {
	@Id  
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_sal")
	private int empSal;
	public Employee(int empId,String empName, int empSal) {
		super();
		this.empId=empId;
		this.empName = empName;
		this.empSal = empSal;
	}

}
