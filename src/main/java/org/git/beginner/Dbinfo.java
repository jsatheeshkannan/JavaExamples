package org.git.beginner;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dbinfo {
	private String dbname;
	private String password;
	private int port;
	private String ip;
	private String user;
	private Dbtable dtable;
	
	
	public Dbtable getDtable() {
		return dtable;
	}
	public void setDtable(Dbtable dtable) {
		this.dtable = dtable;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "Dbinfo [dbname=" + dbname + ", password=" + password + ", port=" + port + ", ip=" + ip + "]";
	}
	
	
	
	/*port=3306
	password=user1
	dbname=demo
	ip=192.168.10.129
	username=user1
*/
}
