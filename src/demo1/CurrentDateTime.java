package demo1;
//import java.time.format.*;
//import java.time.*;

public class CurrentDateTime {

	public static void main(String[] args) {
		//DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYYY/MM/DD HH:mm:ss"); 
        //LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.LocalTime.now());
	}

}
