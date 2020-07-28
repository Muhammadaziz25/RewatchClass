package class57_Exceptions;

import java.io.IOException;

public class Class2 extends Class1{

	public void method1() throws Exception {

	}

	public void method2() throws Exception {

	}

	public void method3() throws IOException {

	}

//	public void method4() throws Exception {
//
//	} Cannot override by throwing a new exception
	
//	public void method5() throws Throwable {
//
//	} Cannot override the exception that is Parent Exception (Exception   Throwable, IOException   Exception)
	
//	public void method6() throws ArithmeticException {
//
//	} overriding rule does not apply to unchecked exceptions

}
