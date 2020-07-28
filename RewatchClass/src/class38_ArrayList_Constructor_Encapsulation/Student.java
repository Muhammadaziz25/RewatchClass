package class38_ArrayList_Constructor_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 20.03.2020
 * @author Eagle
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private String id;
	
	
	public Student() {
		
	}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id ="" + System.currentTimeMillis();
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getId() {
		return id;
	}
	
	public ArrayList<Student> addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("First name: ");
		String fName = sc.next();
		System.out.println();
		System.out.print("Last name: ");
		String lName = sc.next();
		
		Student student1 [] = new Student[0]; //regular array
		ArrayList<Student> students = new ArrayList<>(); // array list
		students.add(new Student(fName, lName));
		
		return students;
	}
}
