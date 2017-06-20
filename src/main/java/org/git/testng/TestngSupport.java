package org.git.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSupport {
	
	@BeforeTest
	public void preTest(){
		System.out.println("####PreTest using BeforeTest Annotation");
	}
	
	@Test
	public void BasicTest1(){
		System.out.println("##BasicTest1 using Test Annotation##");
	}
	
	@Test
	public void BasicTest2(){
		System.out.println("##BasicTest2 using Test Annotation##");
	}
	@Test
	public void Bt(){
		System.out.println("Bt block executing....");
	}
	@Test
	public void BasicTest3(){
		System.out.println("##BasicTest3 using Test Annotatio##");
	}
	@BeforeMethod
	public void preMethod(){
		System.out.println("####PreMethod using BeforeMethod Annotation");
	}
	@AfterMethod
	public void postMethod(){
		System.out.println("PostMethod using AfterMethod Annotation####");
	}
	@AfterTest
	public void postTest(){
		System.out.println("PostTest using AfterTest Annotation####");
	}
	
}
