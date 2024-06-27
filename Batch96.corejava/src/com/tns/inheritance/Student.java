package com.tns.inheritance;

public class Student extends customer{
private String collegeName;
private int rollno;
 
public Student() {
	super();
}

public Student(String name, int id, long adharNo, long phoneNo,String collegeName, int rollno) {
	super(name, id, adharNo, phoneNo);
	this.collegeName = collegeName;
	this.rollno = rollno;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

@Override
public String toString() {
	return "Student [collegeName=" + collegeName + ", rollno=" + rollno + "]";
}



}
