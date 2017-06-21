package org.git.beginner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.testng.annotations.Test;


public class MarshallUnMar {

	@Test
	
	public void ObjectToXmlMarshaller(){
		Dbinfo d = new Dbinfo();
		Dbtable dt = new Dbtable();
		dt.setName("company");
		dt.setEmp("vuser1");
		d.setDbname("demo");
		d.setIp("192.168.10.129");
		d.setUser("user1");
		d.setPassword("user1");
		d.setDtable(dt);
		
		
		try {
			
			JAXBContext c1= JAXBContext.newInstance(Dbinfo.class);
			Marshaller m1 = c1.createMarshaller();
			m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m1.marshal(d,System.out);
		
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
