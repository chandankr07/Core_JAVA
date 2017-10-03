
// Enum in java is a data type that contains fixed set of constants. It is available from JDK 1.5.

class Enum{  
	
	enum days {Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday};
	
 public static void main(String args[]){  
	 
	 	 
	 for(days en: days.values())
		 System.out.println(en);
 
	 days day=days.Saturday;  
	  
	 switch(day){  
	 case Sunday:   
	  System.out.println("\nsunday");  
	  break;  
	 
	 case Monday:   
	  System.out.println("\nmonday");  
	  break;  

	 case Saturday:   
		  System.out.println("\nMyDay");  
		  break;  
	  
	 default:  
		 System.out.println("\nother day");  
	 	}  
	 }
 }  
