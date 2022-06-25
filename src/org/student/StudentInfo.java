package org.student;

public class StudentInfo {
	
	public void stu() {
		
	int studentId = 100;
	String studentName ="abdul";
	int mark1= 95;
	int mark2= 90;
	int mark3= 90;
	int mark4 = 85;
	int mark5 = 80;
	
	System.out.println(studentId);
	System.out.println(studentName);
	System.out.println(mark1 +mark2 +mark3+mark4+mark5);
	System.out.println((mark1+mark2+mark3+mark4+mark5) / 5);
	
	
	}
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.stu();
	}
}
