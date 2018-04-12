package com.assignment_2;

import java.util.Scanner;

public class Database
{
     static int[]    empNumber;
     static String[] empName;
     static String[] empAddress;
     static int[]    empSalary;
     static int      maxEmployees;
     static String[] insuranceScheme;
 
     static Scanner scan = new Scanner(System.in);
     
     public static void main (String[] args)
     {
        Database db = new Database();
        int numOfEmployees;
 
        System.out.println();
        System.out.println("Please print the maximum number of employees to store: ");
        numOfEmployees = scan.nextInt();
        scan.nextLine();
 
        db.menu(numOfEmployees);
     }
    
     public void menu (int numOfEmployees)
     {
        maxEmployees = numOfEmployees;
        empNumber = new int[maxEmployees];
        empName = new String[maxEmployees];
        empAddress = new String[maxEmployees];
        empSalary = new int[maxEmployees];
        String str = "";
        char strChar = 'a';
        int empID;
 
        try 
        {
        	while(strChar != 'e')
            {
                System.out.println();
                System.out.println("Employee Insurance System Menu");
                System.out.println("_______________________________");
                
                System.out.println("a) Add a new Employee");
                System.out.println("b) Delete an Employee");
                System.out.println("c) Print a Employee Insurance Scheme");
                System.out.println("d) Print a Specific Employee");
                System.out.println("e) Exit the Employee Management System");
     
                System.out.println();         
                System.out.println("Select an option from a through e:");
     
                str = scan.nextLine();
                str = str.toLowerCase();
                strChar = str.charAt(0);
     
                switch(strChar)
                {
                   case 'a':
                   addEmployee();
                   break;
                   
                   case 'b':
                   System.out.println("Enter the employee number:");
                   empID = scan.nextInt();
                   deleteEmployee();
                   break;
                   
                   case 'c':
                   printEmployeeSchemeList();
                   break;
                   
                   case 'd':
                   System.out.println("Enter the employee number:");
                   empID = scan.nextInt();
                   printEmployee(empID);
                   break;
                   
                   case 'e':
                   break;
                   
                   default:
                   System.out.println("Invalid entry, Please choose from menu option.");
                   break;
                 }
            }
        }
        
        catch (Exception e)
        {
        	System.out.println("Unexpected input. Shutting down.");
        }
        
     }
       
     
     public void addEmployee()
     {
          int  count = 0;
          int count2 = 0;
          int newEmployeeId = 0;
 
          while((count < maxEmployees) && (empNumber[count] != 0))
          {
             count++;
 
             if(count < maxEmployees)
             {
                 System.out.println("Enter the employee id: ");
                 newEmployeeId = scan.nextInt();
                 scan.nextLine();
             }
             else
            	 System.out.println("The database is full.");
          }
          
          while((count2 < maxEmployees) && (newEmployeeId != empNumber[count2]))
          {
             count2++;
 
             if(count2 == maxEmployees)
             {
            	 empNumber[count2] = newEmployeeId;
            	 
                 System.out.println("Enter employee's name: ");
                 empName[count] = scan.nextLine();
     
                 System.out.println("Enter employee's address: ");
                 empAddress[count] = scan.nextLine();
     
                 System.out.println("Enter employee's salary: ");
                 empSalary[count] = scan.nextInt();
                 scan.nextLine();
             }
             
             else
             {
            	 System.out.println("Employee already exists in database.");
             }     
             
          }
     }
     
     public void deleteEmployee()
     {
    	 int  count = 0;
    	 int count2 = 0;
         int newEmployeeId = 0;

         while((count < maxEmployees) && (empNumber[count] != 0))
         {
            count--;

            if(count < maxEmployees)
            {
                System.out.println("Enter the employee id: ");
                newEmployeeId = scan.nextInt();
                scan.nextLine();
            }
            else
           	 System.out.println("The database is empty.");
         }
         
         while((count2 < maxEmployees) && (newEmployeeId != empNumber[count2]))
         {
            count2--;
            System.out.println("Record deleted.");

            if(count2 != newEmployeeId)
            {
            	System.out.println("No such Employee exists in the database.");
            }
            
         }
     }
     
     public void printEmployeeSchemeList()
     {
    	 
     }
     
     public void printEmployee(int empID)
     {
    	 
     }
}