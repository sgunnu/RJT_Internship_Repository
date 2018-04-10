package com.basic;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class PersonMain 
{
	static class Person
	{	
		String first_name;
		String last_name;
		int phone_number;
		String gender;
		int day_of_birth;
		String month_of_birth;
		int year_of_birth;
		
		void ageCalculator(int year_of_birth, String month_of_birth, int day_of_birth)
		{
			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(year_of_birth, Month.valueOf(month_of_birth), day_of_birth);
			 
			Period p = Period.between(birthday, today);
			
			System.out.println(p.getDays());
			System.out.println(p.getMonths());
			System.out.println(p.getYears());
		}
		
		void person_attribute_gender(String gender)
		{		
			System.out.println("Gender:");
			System.out.printf(gender,"\n");
		}
		
		void getFullName(String first_name, String last_name)
		{			
			System.out.println("Full Name:");
			System.out.printf(first_name," ");
			System.out.printf(last_name,"\n");
		}

	}	

		@SuppressWarnings({ "resource" })
		public static void main(String[] args) 
		{
			String first_name;
			String last_name;
			int day_of_birth;
			String month_of_birth;
			int year_of_birth;
			//long phone_number;
			String gender;
			
			Person p = new Person();
			Scanner input_terms = new Scanner(System.in);
			
			System.out.println("Enter First Name:");
			first_name = input_terms.nextLine();
			System.out.println("Enter Last Name:");
			last_name = input_terms.nextLine();
			p.getFullName(first_name, last_name);
			/*
			System.out.println("Enter Phone Number:");
			phone_number = input_terms.nextInt();
			*/
			System.out.println("Enter Gender:");
			gender = input_terms.nextLine();
			
			if(gender == "M" || gender == "F")
			{
				p.person_attribute_gender(gender);
			}
			else
			{
				System.out.println("Gender must be M/F.");
			}
			
			System.out.println("Enter Year of Birth:");
			year_of_birth = input_terms.nextInt();
			System.out.println("Enter Month of Birth:");
			month_of_birth = input_terms.nextLine();
			System.out.println("Enter Day of Birth:");
			day_of_birth = input_terms.nextInt();
			p.ageCalculator(year_of_birth, month_of_birth, day_of_birth);
		}
	
}