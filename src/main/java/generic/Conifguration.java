package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Conifguration {
	Properties pro;
	public Conifguration(){
	try{
		File src = new File("./conif.property");
		FileInputStream fis = new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);		
	}
	catch(Exception e){
		System.out.println("Exception is =="+e.getMessage());
	}
	}
      public  String getURL(){
    	  return pro.getProperty("URL");
      }         
}
