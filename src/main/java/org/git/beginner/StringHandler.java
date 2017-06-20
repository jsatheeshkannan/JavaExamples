package org.git.beginner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class StringHandler {
	String str="uperf represents the next generation benchmarking tools (like filebench) where instead of running a fixed benchmark or workload, a description (or model) of the workload is provided and the tool generates the load according to the model. By distilling the benchmark or workload into a model";
	
	@Test
	public void stringHndl(){
		
		System.out.println(str.substring(11, 15));
	}
	@Test
	public void stringHndl1(){
		
		System.out.println(str.substring(10));
	}
	@Test
	public void stringHndl2(){
		
		System.out.println(str.indexOf("next"));
	}

	@Test
	public void stringRegex1(){
		str="generation";
		String pattern1="generation";
		String pat="gene";
		System.out.println("Exact Matches of String "+Pattern.matches(pattern1, str));
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		System.out.println("Matches found in String "+m.find());
		
		//System.out.println(str.substring(10));
	}

}
