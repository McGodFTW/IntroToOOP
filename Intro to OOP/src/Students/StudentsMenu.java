package Students;

import java.util.Scanner;

public class StudentsMenu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		
		s1.setLastName("Kirubaharan");
		s1.setFirstInitial("H");
		s1.setAge(8);
		s1.setStudentNumber(201116554);
		s1.setAverage(89.5);
		
		s2.setLastName("Binns");
		s2.setFirstInitial("D");
		s2.setAge(13);
		s2.setStudentNumber(20163423);
		s2.setAverage(37.9);
		
		s3.setLastName("Singh");
		s3.setFirstInitial("T");
		s3.setAge(16);
		s3.setStudentNumber(20103432);
		s3.setAverage(92);
		
		System.out.println("-=+ Student 1 +=-");
		System.out.println("Name: " + s1.getFirstInitial() + ". " + s1.getLastName());
		System.out.println("Student Number: " + s1.getStudentNumber());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Average: " + s1.getAverage());
		System.out.println();
		
		System.out.println("-=+ Student 2 +=-");
		System.out.println("Name: " + s2.getFirstInitial() + ". " + s2.getLastName());
		System.out.println("Student Number: " + s2.getStudentNumber());
		System.out.println("Age: " + s2.getAge());
		System.out.println("Average: " + s2.getAverage());
		System.out.println();
		
		System.out.println("-=+ Student 3 +=-");
		System.out.println("Name: " + s3.getFirstInitial() + ". " + s3.getLastName());
		System.out.println("Student Number: " + s3.getStudentNumber());
		System.out.println("Age: " + s3.getAge());
		System.out.println("Average: " + s3.getAverage());
		System.out.println();


	}

}
