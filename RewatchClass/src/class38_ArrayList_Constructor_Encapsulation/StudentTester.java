package class38_ArrayList_Constructor_Encapsulation;

import java.util.ArrayList;

public class StudentTester {

	public static void main(String[] args) {

//		Student student = new Student("Muhammad", "Aziz");
//		
//		System.out.println(student.getFirstName());
//		System.out.println(student.getLastName());
//		System.out.println(student.getId());

		ArrayList<String> arrayList = new ArrayList<>();

//		System.out.println(arrayList.size());
		arrayList.add("Sony"); // adding element to array list
		arrayList.add("Japan");
//		System.out.println(arrayList.size());
		arrayList.add("Apple");
		arrayList.add("USA");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		Student student2 = new Student();

		for (Student st : student2.addStudent()) {
			System.out.println(st.getFirstName());
			System.out.println(st.getLastName());
			System.out.println(st.getId());
		}
	}

}
