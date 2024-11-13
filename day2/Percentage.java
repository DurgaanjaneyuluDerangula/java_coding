import java.util.*;
public class Percentage
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int phy,che,bio,mat,comp;
		System.out.println("enter phy marks");
		phy=sc.nextInt();
			System.out.println("enter che marks");
		che=sc.nextInt();
			System.out.println("enter bio marks");
		bio=sc.nextInt();
			System.out.println("enter mat marks");
		mat=sc.nextInt();
			System.out.println("enter comp marks");
	    comp=sc.nextInt();
	    int total=phy+che+bio+mat+comp;
	    int avg=total/5;
	    if(avg>=90 && avg<=100){
	    	System.out.println("Grade:A - "+avg+"%");
	    }
	    else if(avg>=80 && avg<90){
	    	System.out.println("Grade:B - "+avg+"%");
	    }
	    else if(avg>=70 && avg<80){
	    	System.out.println("Grade:C - "+avg+"%");
	    }
	    else if(avg>=60 && avg<70){
	    	System.out.println("Grade:D - "+avg+"%");
	    }
	    else if(avg>=40 && avg<60){
	    	System.out.println("Grade:E - "+avg+"%");
	    }
	    else{
	    	System.out.println("Grade:F - "+avg+"%");
	    }
	}
}