package class39_EncapsulationAndStatic;

public class BookTester {
	
	public void instanceMethod() {
		Book b1 = new Book();
		System.out.println(b1.ISBN);
		System.out.println(b1.type);
		String str = Book.type;
		
	}

	public static void main(String[] args) {

		Book b = new Book();
	}

}
