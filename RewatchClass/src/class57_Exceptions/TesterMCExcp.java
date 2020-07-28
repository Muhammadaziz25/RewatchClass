package class57_Exceptions;

public class TesterMCExcp {

	public static void main(String[] args) {

//		try {
//			method();
//		}catch(MyCustomException e){
//			System.out.println("Exception caught");
//		}
		
		try {
			method1();
		}catch(ClassNotFoundException c){
			System.out.println(c.getMessage());
		}
		
		
		
	}
	
	public static void method() throws MyCustomException {
		throw new MyCustomException();
	}
	
	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException("ClassNotFoundExceptuion has caught");
	}

}
