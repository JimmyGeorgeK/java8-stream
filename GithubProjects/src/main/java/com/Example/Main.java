package com.Example;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
        Dao hr = new Dao();
 
        Employee emp= new Employee();
        
        Scanner input = new Scanner(System.in);
 
       
        int option = 0;
   
        do {
            menu();
            option = input.nextInt();
 
            switch (option) {
                case 1:
                    System.out.print("Enter ID number:  ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Employee Name:  ");
                    String name = input.nextLine();
                    System.out.print("Enter Employee Designation:  ");
                    String desg = input.nextLine();
                    System.out.print("Enter Employee Department:  ");
                    String dept = input.nextLine();
                    System.out.print("Enter Age:  ");
                    int age = input.nextInt();
                    System.out.print("Enter Salary:  ");
                    double salary = input.nextDouble();
                    
                  
                    emp = new Employee(id,name,age,desg,dept,salary);
                   
                    hr.add(emp);
                    break;
                case 2:
                    System.out.print("Enter the Employee ID to Delete");
                    int eId = input.nextInt();
                    // invoke remove/delete record
                    hr.delete(eId);
                    break;
                case 3:
                    System.out.print("Enter the Employee ID to be updated ");
                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);
                    break;
 
                case 4:
                    System.out.print("Enter the Emp ID to search:  ");
                    int bookId = input.nextInt();
 
                    if (!hr.find(bookId)) {
                        System.out.println("Record id does not exist\n");
                    }
 
                    break;
                case 5:
                    hr.display();
                    break;
                case 6:
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid input\n");
                    break;
 
            }
        } while (option != 6);
    }
 
    
    public static void menu() {
        System.out.println("MENU");
        System.out.println("1: Add Record");
        System.out.println("2: Delete Record");
        System.out.println("3: Update Record");
        System.out.println("4: Search Record");
        System.out.println("5: Display Records");
        System.out.println("6: Exit program");
        System.out.print("Enter your selection : ");
    }
		

}


