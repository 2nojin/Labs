package kr.or.bit;

import java.io.IOException;

public class ExClass {
	public ExClass(String path) throws IOException {
		
	}
	
	public void call() throws ArithmeticException, IndexOutOfBoundsException{
		System.out.println("call �Լ� START");
		
		int i=1/0;
		System.out.println("call �Լ� END");
		
	}
	
	
}
