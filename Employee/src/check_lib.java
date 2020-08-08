import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class check_lib {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Scenario 1
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any integer: ");
		int num= Integer.parseInt(sc.nextLine());
		String hex = Integer.toHexString(num);
		String oct = Integer.toOctalString(num);
		String bin = Integer.toBinaryString(num);

		
		System.out.printf("The hexadecimal form of %d is %s \n", num, hex);
		System.out.printf("The octadecimal form of %d is %s \n", num, oct);
		System.out.printf("The binary form of %d is %s \n", num, bin);
		*/
		
		//---------------------------------------------------------------------------------//
		
		//Scenario 2
		/*
		System.out.println(Math.sqrt(64));
		
		int rand =(int)Math.ceil(Math.random() * 10);
		
		System.out.println(rand);
		*/
		
		
		
		
		//----------------------------------------------------------------------------------//
		
		//Scenario 3
		
		Runtime r = Runtime.getRuntime();
		
		long totalmem = r.totalMemory()/1024/1024;
		long freemem = r.freeMemory()/1024/1024;
		long maxmem = r.maxMemory()/1024/1024;
		
		System.out.println("Total memory is : " + totalmem + " MB approx");
		
		System.out.println("Free memory is : " + freemem + " MB approx");
		
		System.out.println(" Maximum memory is : " + maxmem + " MB approx");
		
		System.out.println(" Just trying stuff : " + r.availableProcessors());
		
		
		//----------------------------------------------------------------------------------------------//
		
		//Scenario 4
		
		//----OLDER VERSION----//
		 Calendar NewYork = Calendar.getInstance();
	     NewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		    System.out.println(); 
	      System.out.println("Time in New York: " + NewYork.get(Calendar.HOUR_OF_DAY) + ":"
	        + NewYork.get(Calendar.MINUTE)+":"+NewYork.get(Calendar.SECOND));
	      
	    //----New Version----//
	      ZoneId NY = ZoneId.of("Pacific/Galapagos");
	      ZonedDateTime zone2   = ZonedDateTime.now(NY);
	      LocalTime time = zone2.toLocalTime();
	      //System.out.println("In Tokyo Central Time Zone: "  + zone2);
	      
	      System.out.println(zone2.getHour() + ":" + zone2.getMinute());
	 	
	
	
	//-------------------------------------------------------------------------------------------------//
	
	//Scenario 5
	
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the day: ");
	      int day  = Integer.parseInt(sc.nextLine());
	      
	      System.out.print("Enter the month no. : ");
	      int mm  = Integer.parseInt(sc.nextLine());
	      
	      System.out.print("Enter the Year: ");
	      int yyyy  = Integer.parseInt(sc.nextLine());
	      
	      LocalDate week = LocalDate.of(yyyy, mm, day);
	      
	      System.out.println(week.getDayOfWeek());
	      
	      
	      /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
		  DayOfWeek date1 = LocalDate.parse(date, formatter).getDayOfWeek();
	      
		  System.out.println(date1);
		  */
	      
	      
	      //-----------------------------------------------------------------------------------------//
	      
	      //Scenario 6
	      
	      //----NEW VERSION----//
	      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");  
	      LocalDateTime now = LocalDateTime.now();  
	      System.out.println(dtf.format(now)); 
		  
	      
	      //----OLDER VERSION----//
	      
	      SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
	      Date ddd = new Date();
	      System.out.println(df.format(ddd));
	      
	      
	      //--------------------------------------------------------------------------------------//
	      
	      //Scenario 7
	      
	      LocalDate age1 = LocalDate.now();
	      Period age = Period.between(week, age1);
	      System.out.println(age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days ");
	      System.out.println("Age : " +age.getYears()+ "yrs");
	
	}

}
