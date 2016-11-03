package org.git.testng;

import org.testng.annotations.Test;

public class TestNGExtend extends TestngSupport{
	
	@Test
	public void extendTest1(){
		System.out.println("$$$$extended Test1 with Test Annotation$$$$");
	}

}
