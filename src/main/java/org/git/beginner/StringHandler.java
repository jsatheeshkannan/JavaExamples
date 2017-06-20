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
		String str2="generation";
		String pattern1="generation";
		String pattern2="off";
		
		System.out.println("Exact Matches of String "+Pattern.matches(pattern1, str2));
		Pattern p = Pattern.compile(pattern2);
		Matcher m = p.matcher(str);
		boolean found = false;
		try{
		while(m.find()){
		System.out.println("Matches found in String "+m.group());
		found = true;
		}
		if(!found){
			System.out.println("No matches found");
		}
		//System.out.println("matches method:"+m.matches());
		System.out.println("Start and End:"+m.start()+":"+m.end());
		System.out.println("ReplaceFirstMethod:"+m.replaceFirst("cap"));
		System.out.println(m.groupCount());
		System.out.println("Replacing all by oof:"+m.replaceAll("oof"));
		}catch(IllegalStateException e){
			e.printStackTrace();
		}
		
		String pincode="344999";
		String patternpin="\\d{2}";
		p  = Pattern.compile(patternpin);
		m = p.matcher(pincode);
		int count=0;
		while(m.find()){
		System.out.println(m.group());
		count++;
		}
		System.out.println("No of Digit Matches found:"+count);
		
		//System.out.println(str.substring(10));
	}

}
