package Experiments;

import java.util.Date;



public class GenerateEmailWithTimeStamp {
	public static void main(String args[]) {
		Date date= new Date();
		String StringDate =date.toString();
		String DateWithNoSpace=StringDate.replaceAll(" ", "");
		String DateWithNoSpaceAndColon=DateWithNoSpace.replaceAll("\\:", "");
		System.out.println(DateWithNoSpaceAndColon);
		
	    
	}
	
	
}
