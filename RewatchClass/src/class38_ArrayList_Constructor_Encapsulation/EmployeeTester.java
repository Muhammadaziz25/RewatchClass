package class38_ArrayList_Constructor_Encapsulation;

import java.util.Scanner;

/**
 * 20.03.2020
 * @author Eagle
 *
 */
public class EmployeeTester {

	public static void main(String[] args) {

//		Employee ep = new Employee("Ali", "Hamzaoglu", 19);
//		Employee ep2 = new Employee("Mesut", "Ozil", 32);
//		Employee ep3 = new Employee("Muhammad", "Salah", 28);
		
//		Employee[] employeeList = new Employee[3];
//		employeeList[0] = new Employee("Ali", "Hamzaoglu", 19);
//		employeeList[1] = new Employee("Mesut", "Ozil", 32);
//		employeeList[2] = new Employee("Muhammad", "Salah", 28);
//		
//		for(Employee employee : employeeList) {
//			System.out.println(employee.getFirstName());
//			System.out.println(employee.getLastName());
//			System.out.println(employee.getAge());
//			System.out.println("=================================");
//		}
		
//		Employee[] employeeList2 = {new Employee("Ali", "Hamzaoglu", 19),
//		new Employee("Mesut", "Ozil", 32), 
//		new Employee("Muhammad", "Salah", 28)};
		
//		System.out.println(ep.getFirstName());
//		System.out.println(ep.getLastName());
//		System.out.println(ep.getAge());
//		
//		System.out.println("==========================================");
//		
//		System.out.println(ep2.getFirstName());
//		System.out.println(ep2.getLastName());
//		System.out.println(ep2.getAge());
//		
//		System.out.println("==========================================");
//		System.out.println(ep3.getFirstName());
//		System.out.println(ep3.getLastName());
//		System.out.println(ep3.getAge());
		
		/*
		 * Write a method called addEmployee
		 * public static void addEmployees()
		 * the method should ask the number of employees 
		 * ask firstName, lastName and age
		 * and the method should print all added employees in the console
		 */
		
		for(Employee employee : addEmployees()) {
			System.out.println(Employee.getManagerName());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getAge());
			System.out.println("=================================");
		}
	}
	
	public static Employee[] addEmployees() {
		System.out.println("Enter number of employees: ");
		Scanner sc = new Scanner(System.in);
		int numOfEmp = sc.nextInt();
		Employee employees[] = new Employee[numOfEmp];
		for (int i = 0; i < employees.length; i++) {
			System.out.print("Enter first name for employee no: " + (i+1));
			String firstName = sc.next();
			System.out.println();
			System.out.print("Enter last name for employee no: " + (i+1));
			String lastName = sc.next();
			System.out.println();
			System.out.print("Enter age for employee no: " + (i+1) + " ");
			int age = sc.nextInt();
			System.out.println();
			System.out.print("Enter Manager name for employee no: " + (i+1));
			String managerName = sc.next();
			Employee.setManagerName(managerName);
			
			
			employees[i] = new Employee(firstName, lastName, age);
		}
		
		sc.close();
		return employees;
		
//		for( Employee emp : employees) {
//			System.out.println(emp.getFirstName());
//			System.out.println(emp.getLastName());
//			System.out.println(emp.getAge());
//			System.out.println("=================================");
//		}
		
		
	}

}
