package Experiments;

import java.util.Date;



public class GenerateEmailWithTimeStamp {
	public static void main(String args[]) {
		Date date= new Date();
	    String dateString= date.toString();
	    String noSpacedateString= dateString.replaceAll(" ", "");
	    String NoSpaceANDNoColondateString =noSpacedateString.replaceAll("\\:", "");
	    String emailWithTimeStamp=NoSpaceANDNoColondateString+"@gmail.com";
	    
	}
	
	
}
