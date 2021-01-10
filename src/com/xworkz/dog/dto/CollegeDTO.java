package com.xworkz.dog.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mapping using entity [its convert normal_object to java_object] 
@Table(name ="collegedto_tables") //it will tell the mysql to object
public class CollegeDTO implements java.io.Serializable
{                                            //for maintain standard to use seializable [marker interface]
                                             //why we use serializable bcz it convert object state in to persistence state	
	
	@Id  //It's a primary key
	@Column(name = "COLLEGE_ID") //column name to tell hibernate
	private	int collegeID;//Encapsulation we should private the data
	
	@Column(name = "CNAME")
	private	String cName; //step3 : fields should be
	
	@Column(name ="CLOCATION")
	private String cLOcation;
	
	@Column(name = "NO_OF_STUDENTS")
	private	String noofStudents;
	
	@Column(name ="NO_OF_CLASSROOMS")
	private	int noofClassRooms;
	
	@Column(name ="NO_OF_BRANCHES")
	private	int noofBranches;

    public CollegeDTO() { //step2 : 1.Default constructor 
	System.out.println("college details are:");
		
	}



public CollegeDTO(int collegeID, String cName, String cLOcation, String noofStudents, int noofClassRooms,
		int noofBranches) {  //step2:2.parameterized constructor 
	super();
	this.collegeID = collegeID;
	this.cName = cName;
	this.cLOcation = cLOcation;
	this.noofStudents = noofStudents;
	this.noofClassRooms = noofClassRooms;
	this.noofBranches = noofBranches;
}


public int getCollegeID() {//step1:set getter setter
	return collegeID;
}
public void setCollegeID(int collegeID) {
	this.collegeID = collegeID;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getcLOcation() {
	return cLOcation;
}
public void setcLOcation(String cLOcation) {
	this.cLOcation = cLOcation;
}
public String getNoofStudents() {
	return noofStudents;
}
public void setNoofStudents(String noofStudents) {
	this.noofStudents = noofStudents;
}
public int getNoofClassRooms() {
	return noofClassRooms;
}
public void setNoofClassRooms(int noofClassRooms) {
	this.noofClassRooms = noofClassRooms;
}
public int getNoofBranches() {
	return noofBranches;
}
public void setNoofBranches(int noofBranches) {
	this.noofBranches = noofBranches;
}



}
