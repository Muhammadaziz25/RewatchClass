package class35_ObjectAndClassesCont;

public class Student {
	
	String name;
	int id;
	int age;
	String type;
	int score;
	
	public String getName() {
		return name;
		
	}
	
	public int getScore() {
		return score;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setScore( int newScore) {
		score = newScore;
	}
	
	public void setType( String newType) {
		type = newType;
	}
	
	public void increaseScore() {
		score +=1;
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		
		st.age = 25;
		st.id = 2020;
		st.name = "Abdulaziz";
		st.score = 95;
		st.type = "online";
		
		System.out.println("The student name is: " + st.getName() + ", id: " + st.getId() +
				", age: " + st.getAge() + ", score: " + st.getScore());
		
		
		st.setScore(94);
		System.out.println(st.getScore());
		st.increaseScore();
		System.out.println(st.getScore());
	}

}
