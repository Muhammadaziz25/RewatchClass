package class57_Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
//			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
	}

}
