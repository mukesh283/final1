package com.flp.ems.domain;

import java.sql.Date;

import javax.jws.soap.SOAPMessageHandlers;

public class Employee {
	Department department=new Department();
	Role role=new Role();
	Project project=new Project();
	String Name,Address,EmailId;
	static int EmployeeId=0;
	String KinId;
	int DepartmentId,ProjectId,RolesId;
	long PhoneNo;
	String dob,doj;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	public String getAddress() {
		return Address;
	}
	
	public String setDob(String dob) {
		return dob;
	}
	public String getDob() {
		return dob;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
		public String getDoj() {
		return doj;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	/*public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}*/
	public int getDepartmentId() {
		DepartmentId=department.getDepartmentId();
		return DepartmentId;
	}
	
	public int getEmployeeId() {
		return EmployeeId++;
	}
	public String getKinId() {
		return KinId;
	}
	public void setKinId(String kinid)
	{
		KinId=kinid;
	}
	/*public void setProjectId(int projectId) {
		ProjectId = projectId;
	}*/
	public int getProjectId() {
		 ProjectId=project.getProjectId();
		 return ProjectId;
	}
	public void setRolesId(int rolesId) {
		RolesId = rolesId;
	}
	public int getRolesId() {
		RolesId=role.getRoleId();
		return RolesId;
	}
	
	@Override
	public String toString() {
		return "Employee [KinId=" + KinId + ", EmailId=" + EmailId + ", Name=" + Name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmailId == null) ? 0 : EmailId.hashCode());
		result = prime * result + ((KinId == null) ? 0 : KinId.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}
	
	
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (EmailId == null) {
			if (other.EmailId != null)
				return false;
		} else if (!EmailId.equals(other.EmailId))
			return false;
		if (KinId == null) {
			if (other.KinId != null)
				return false;
		} else if (!KinId.equals(other.KinId))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}*/
	public boolean equals(String o) {
	//System.out.println("checking for duplicates...");

	if(KinId.equals(o) | EmailId.equals(o) | Name.equals(o))
	return true;
	return false;
	
}
	
	
	
}
