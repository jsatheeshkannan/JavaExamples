package org.git.beginner;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dbtable {
	
	private String name;
	private String emp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	

}
