package com.Example;
import java.util.*;
public class Dao {

		
		HashSet<Employee> obj=new HashSet<Employee>();
		
		public void add(Employee emp) {
	      
	        if (!find(emp.getId())) {
	            obj.add(emp);
	 
	        } 
	        else 
	        {
	            System.out.println("Record already exists in the Record list");
	        }
	    }
    
		public boolean find(int idNimber) {
	        for (Employee l : obj) {
	            
	            if (l.getId() == idNimber) {
	                System.out.println(l);
	                return true;
	            }
	        }
	        return false;
	    }
    
   
    public void delete(int recIdNumber) {
        Employee recordDel = null;
        
        for (Employee ll : obj) {
            
            if (ll.getId() == recIdNumber) {
                recordDel = ll;
            }
        }
        
        if (recordDel == null) {
            System.out.println("Invalid record Id");
        } else {
            obj.remove(recordDel);
            System.out.println("Successfully removed record from the list");
        }
    }
 
   
    public Employee findRecord(int idNumber) {
        for (Employee l : obj) {
            if (l.getId() == idNumber) {
                return l;
            }
        }
        return null;
    }
 
    
    public void update(int id, Scanner input) {
 
        if (find(id)) {
            Employee rec = findRecord(id);
 
            System.out.print("Enter the new Emp ID:  ");
            int idNumber = input.nextInt();
            input.nextLine();
            System.out.print("Enter new Employee Name:  ");
            String name = input.nextLine();
            System.out.print("Enter Employee new Designation:  ");
            String desg = input.nextLine();
            System.out.print("Enter Employee new Department:  ");
            String dept = input.nextLine();
            System.out.print("Enter new Age:  ");
            int age = input.nextInt();
            System.out.print("Enter new Salary:  ");
            double salary = input.nextDouble();
            
 
            rec.setId(idNumber);
            rec.setName(name);
            rec.setAge(age);
            rec.setDepartment(dept);
            rec.setDesignation(desg);
            rec.setSalary(salary);
            
            System.out.println("Record Updated Successfully");
        } else {
            System.out.println("Record Not Found in the Record list");
        }
    }
 
    
    public void display() {
        
        if (obj.isEmpty()) {
            System.out.println("The Set has no records\n");
        }
        
        for (Employee record : obj) {
            
            System.out.println(record.toString());
        }

	}

}
