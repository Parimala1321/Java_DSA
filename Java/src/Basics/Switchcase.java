package Basics;

public class Switchcase {

	public static void main(String[] args) {
		
		//switch statement
          int n = 6;
		switch(n) {   //here n the value which we need to check the condition
		  case 1:
		     System.out.println("Monday");
		     break;
		  case 2:
			 System.out.println("Tuesday");
			 break;
		  case 3:
			  System.out.println("Wednesday");
			  break;
		  case 4:
			   System.out.println("Thursday");
			   break;
		  case 5:
			  System.out.println("Friday");
			  break;
		   case 6:
			  System.out.println("Saturday");
			  break;
		   case 7:
			   System.out.println("Sunday");
			   break;
		 default :
			 System.out.println("Enter the valid number");
		}
		
		
		//seasons example
		 String Month = "January";
		  switch(Month) {
		  case "December","January","Febuary":
			  System.out.println("Winter");
		      break;
		  case "March","April","May":
			  System.out.println("Summer");
		      break;
		  case "June","July","August" :
			  System.out.println("Rainy");
		      break;
		      default :
		    	  System.out.println("Spring");
		    	  
		  }
		  
		  
		  
		  
		  // updated switch statement
		  String Months = "November";
		  switch(Months) {
		  case "December","January","Febuary" -> System.out.println("Winter");
		  case "March","April","May" ->  System.out.println("Summer"); 
		  case "June","July","August" -> System.out.println("Rainy");
	      default  ->  System.out.println("Spring");
		    	  
		  }
		  
		  
		  
		  //assigning the result
		  String Mon = "April";
		  String Result = "";
		  Result =  switch(Mon) {
		       case "December","January","Febuary" -> "Winter";
		       case "March","April","May" ->  "Summer"; 
		       case "June","July","August" -> "Rainy";
	           default  ->  "Spring";
		    	  
		  };
		  System.out.println(Result);
	}

}
