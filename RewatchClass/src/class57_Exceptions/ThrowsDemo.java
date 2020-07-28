package class57_Exceptions;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception {

		method1();
//		throw keyword >>> throws Exception explicitly and used by programmer
		
	}
	
	public static void method1() throws IOException {
		throw new IOException();// throw keyword throws Exception explicitly and used by programmer
	}

}
