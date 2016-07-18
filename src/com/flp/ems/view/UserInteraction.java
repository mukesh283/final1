package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
public class UserInteraction {
	
public void AddEmployee()
	{
	
	EmployeeServiceImpl empl=new EmployeeServiceImpl();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name:");
		boolean flag=true;
	    String name1 = sc.nextLine();  
		flag=Validate.validateName(name1);
	 if(flag==false){
			 System.out.println("wrong input...ReEnter the valid name");
			 return;
	 }
		System.out.println("Enter the Address:");
		String ad=sc.nextLine();
		System.out.println("Enter the EmailId:");
		
		String emailid=sc.nextLine();
		flag=Validate.validateEmail(emailid);
		if(flag==false){
			System.out.println("Invalid EmailId***");
			return;
		}
		System.out.println("Enter Phn no...it must be 10 digit number");
		Scanner input=new Scanner(System.in);
		long phn=input.nextLong();
		flag=Validate.validatePhnNo(phn);
		if(flag==false){
			System.out.println("wrong PhnNo format");
			return;
		}
		System.out.println("Enter KinId");
		Scanner s=new Scanner(System.in);
		String kinId=s.nextLine();
		flag=Validate.validateKinId(kinId);
		if(flag==false){
			System.out.println("wrong kinid");
			return ;
		}
		
		System.out.println("Enter DOB in dd/mm/yyyy format");
		Scanner sc1=new Scanner(System.in);
		String dob=sc1.nextLine();
		flag=Validate.validateDate(dob);
		if(flag==false){
			System.out.println("invalid date format");
			return;
		}
		System.out.println("enter DOJ in dd/mm/yyyy format");
		String doj=sc1.nextLine();
		flag=Validate.validateDate(doj);
		if(flag==false){
			System.out.println("invalid format");
			return;
		}
		System.out.println("Department list");
		String[] str={"FS","NFS"};
		System.out.println("FS,NFS");
		int i=0;
		try{
		System.out.println("enter 1 for FS,enter 2 for NFS");
		
		i=sc1.nextInt();
		}
		catch(Exception e){
			System.out.println("please enter from above option");
		}
		String departname = null;
		String description1 = null;
			switch(i){
		
		case 1:
			departname=str[0];
			description1="Financial Sevice";
			
			break;
		case 2:
			departname=str[1];
			description1="NonFinancial Service";
			
			break;
			default:
				System.out.println("wrong input");
		}
		System.out.println("Enter projectname");
		Scanner sc2 = new Scanner(System.in);
		String projname=sc2.nextLine();
		System.out.println("Enter Rolename");
		System.out.println("enter 1 for software engineer");
		System.out.println("enter 2 for consultant");
		System.out.println("enter 3 for HR");
		Scanner num=new Scanner(System.in);
		int option=num.nextInt();
		String rolename=null;
		switch(option){
		case 1:
			rolename="Software Engineer";
			break;
		case 2:
			rolename="consultant";
			break;
		case 3:
			rolename="HR";
			break;
		default:
				System.out.println("enter a valid input");
		}
		
		
		HashMap hm=new HashMap();
		hm.put(1,name1);
		hm.put(2, ad);
		hm.put(3, emailid);
		hm.put(4,phn);
		hm.put(5,dob);
		hm.put(6,doj);
		hm.put(7,departname);
		hm.put(8,description1);
		hm.put(9,projname);
		hm.put(10,rolename);
		hm.put(11, kinId);
		empl.AddEmployee(hm);
	}

public void SearchEmployee() 
	{
	System.out.println("search by kinid,or emailid or name");
	System.out.println("1 to search by kinid");
	System.out.println("2 to search by emailId");
	System.out.println("3 to search by name");
	Scanner sc=new Scanner(System.in);
	EmployeeServiceImpl es=new EmployeeServiceImpl();
	int i=sc.nextInt();
	switch(i){
	case 1:
	System.out.println("enter the kin id to search");
	Scanner sc1=new Scanner(System.in);
	String searchby_kinid=sc1.nextLine();
	es.SearchEmployee(searchby_kinid,1);
	break;
	case 2:
		System.out.println("enter the emailid to search");
		Scanner sc3=new Scanner(System.in);
		String searchby_email=sc3.nextLine();
		es.SearchEmployee(searchby_email,2);
		break;
	case 3:
		System.out.println("Enter the name to search the employee");
		Scanner sc4=new Scanner(System.in);
		String searchby_name=sc4.nextLine();
		es.SearchEmployee(searchby_name,3);
		break;
	}
		
	}

public void ModifyEmployee() 
    {
	
	EmployeeServiceImpl es=new EmployeeServiceImpl();
	System.out.println("enter kinid to update or modify");
	Scanner sc=new Scanner(System.in);
	String kinid=sc.nextLine();
	es.ModifyEmployee(kinid);
	
	}

public void RemoveEmployee() 
	{
	EmployeeServiceImpl es=new EmployeeServiceImpl();
	System.out.println("enter kinid to remove that employee");
	Scanner sc=new Scanner(System.in);
	String kin=sc.nextLine();
	es.RemoveEmployee(kin);
	
	}

public void getAllEmployee() 
	{
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		es.getAllEmployee();
	}
}
