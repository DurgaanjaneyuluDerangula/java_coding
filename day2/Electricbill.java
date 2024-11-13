import java.util.*;
public class Electricbill
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	  	System.out.println("Enter no.of units");
	   int units=sc.nextInt();
	   
	    if(units<=50){
	        double cost=units*0.50;
	        System.out.println("cost: "+cost);
	        double subcharge=(20*cost)/100;
	        System.out.println("scharge: "+subcharge);
	        double bill=cost+subcharge;
	    	System.out.println("bill: "+bill);
	    }
	    else if(units>50 && units<=150){
	     double cost=units*0.75;
	        System.out.println("cost: "+cost);
	        double subcharge=(20*cost)/100;
	        System.out.println("scharge: "+subcharge);
	        double bill=cost+subcharge;
	    	System.out.println("bill: "+bill);
	    }
	    else if(units>150 && units<=250){
	     double cost=units*1.20;
	        System.out.println("cost: "+cost);
	        double subcharge=(20*cost)/100;
	        System.out.println("scharge: "+subcharge);
	        double bill=cost+subcharge;
	    	System.out.println("bill: "+bill);
	    }
	    else{
	    	 double cost=units*1.50;
	        System.out.println("cost: "+cost);
	        double subcharge=(20*cost)/100;
	        System.out.println("scharge: "+subcharge);
	        double bill=cost+subcharge;
	    	System.out.println("bill: "+bill);
	    }
	    
	}
}