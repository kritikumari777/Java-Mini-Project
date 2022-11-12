package typeofconversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTo_ {

	public static void main(String[] args) throws ParseException {

	
		String s = "10";
		
		//String to int
		int n0 = Integer.valueOf(s);
		System.out.println(n0+10);
		int n1 = Integer.parseInt(s);
		System.out.println(n1+20);
		
		// string to long
		long lg = Long.parseLong(s);
		System.out.println(lg+10);
	    
		//string to float
		float flt = Float.parseFloat(s);
		System.out.println(flt);
		
		// string to double
        double D = Double.valueOf(s);
        System.out.println(D+10);
        double d=Double.parseDouble(s);
        System.out.println(d+10);
        
        //String to date
        
        String s2 ="10/1/2022";
        Date date = new  SimpleDateFormat("DD/MM/YYYY").parse(s2); //Add throw 
        System.out.println(date);
        
        //String to char
        
        
        //String to object
        
	}
}
