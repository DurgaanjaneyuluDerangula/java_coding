import java.util.*;
public class Switchcase
{
	public static void main(String[] args) {
	    	System.out.println("Enter Week day number");
	    Scanner sc=new Scanner(System.in);
	    
	    int day_num=sc.nextInt();
	    
	    switch(day_num){
	        case 1: 
	            System.out.println("Sunday");
	            break;
	        case 2: 
	            System.out.println("Monday");
	            break;
	        case 3: 
	            System.out.println("Tuesday");
	            break;
	        case 4: 
	            System.out.println("wednesday");
	            break;
	       case 5: 
	            System.out.println("Thursday");
	            break;
	        
	   case 6: 
	            System.out.println("Friday");
	            break;
	       case 7: 
	            System.out.println("Saturday");
	            break;
	       default:
	            System.out.println("Enter correct value");
	    }
	}
}