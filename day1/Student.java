package week1.day1;

public class Student {
	String studentname="Satheesh kumar",collegename="Sathyabamma";
	int rollno=12,markscored=80;
			
	float cgpa=7.9f;
	

	public static void main(String[] args) {
	
System.out.println("Class report");
Student s=new Student();
System.out.println("Student name is  " +s.studentname);
System.out.println("college name is  "+s.collegename);
System.out.println("roll no is "+s.rollno);
System.out.println("markscored  "+s.markscored);
System.out.println("cgpa  "+s.cgpa);
	}

}
