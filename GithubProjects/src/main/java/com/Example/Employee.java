package com.Example;

public class Employee {
	
	public int id,age;
	public String name,designation,department;
	public double salary;
	
	public Employee() {
		
	}
	public Employee(int id,String name,int age,String designation,String Department,double salary) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.designation=designation;
        this.department=Department;
        this.salary=salary;
    }
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", designation=" + designation
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
}
