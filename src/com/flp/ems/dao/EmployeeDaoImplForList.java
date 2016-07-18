package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;

public class EmployeeDaoImplForList implements IemployeeDao{

	static ArrayList<Employee> arraylist=new ArrayList<Employee>();
	@Override
	public void AddEmployee(Employee e) {
		arraylist.add(e);
		
	}

	@Override
	public void ModifyEmployee(String kinid) {
				int i=-1;
		for(Employee e:arraylist)
		{
			i++;
			if(e.getKinId().equals(kinid)){
			System.out.println(e);
			break;
			}
		}
		System.out.println("i="+i);
			System.out.println("enter 1 to update name");
			System.out.println("enter 2 to update address");
			System.out.println("enter 3 to update emailId");
			Scanner sc=new Scanner(System.in);
			int j=sc.nextInt();
			switch(j){
			case 1:
				Scanner sc1=new Scanner(System.in);
				String nm=sc1.nextLine();
				arraylist.get(i).setName(nm);
				break;
			case 2:
				Scanner sc2=new Scanner(System.in);
				String address=sc2.nextLine();
				arraylist.get(i).setAddress(address);
				break;
			case 3:
				Scanner sc3=new Scanner(System.in);
				String emailid=sc3.nextLine();
				for(Employee e:arraylist){
					if(e.getEmailId().equals(emailid))
					{
					System.out.println("email id already exist");
					}
					else
				arraylist.get(i).setEmailId(emailid);
					}
			}
				
	}
				
	
		
		
	

	@Override
	public void RemoveEmployee(String kinid) {
		int i=-1;
		for(Employee e:arraylist)
		{
			i++;
			if(e.getKinId().equals(kinid)){
			System.out.println(e);
			System.out.println("employee with "+kinid+" has been removed");
			break;
			}
		}
		arraylist.remove(i);
	}

	@Override
	public void SearchEmployee(String search,int i) {
		System.out.println("searching employee...");
		if(i==1 | i==2)
			i=1;
		switch(i){
		case 1:
		Employee emp=null;
		for(Employee e:arraylist){
			if(e.equals(search))
				emp=e;
		}
		if(emp!=null)
		System.out.println(emp);
		break;
		case 3:
			Employee emp1=null;
			for(Employee e:arraylist){
				if(e.equals(search)){
					emp1=e;System.out.println(emp1);}
			/*if(emp1!=null)
			System.out.println(emp1);*/}
			break;
			
		}
		}
	

	@Override
	public void getAllEmployee() {
		for(Employee e:arraylist)
		{
			System.out.println(e);
		}
	}
	
	
	
	}

