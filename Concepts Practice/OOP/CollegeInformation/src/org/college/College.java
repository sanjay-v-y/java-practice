package org.college;

public class College {
	
	private void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("College Name: BIT");
	}
	
	private void collegeRank() {
		// TODO Auto-generated method stub
		System.out.println("College Rank: 7");
	}
	
	private void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("College Code: TNS2358");
	}
	
	public static void main(String[] args) {
		
		College collegeDetails = new College();
		
		collegeDetails.collegeName();
		collegeDetails.collegeCode();
		collegeDetails.collegeRank();
		
		Student studentDetails = new Student();
		
		studentDetails.studentName();
		studentDetails.studentId();
		studentDetails.studentDept();
		
		Hostel hostelDetails = new Hostel();
		
		hostelDetails.hostelName();	
		
		Dept deptDetails = new Dept();
		
		deptDetails.deptName();
	}
}
