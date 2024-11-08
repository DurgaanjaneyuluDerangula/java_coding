import java.util.Scanner;
class Switch{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
String Date="";
int a=s.nextInt();
switch(a){
case 1: Date="1-January";
break;
case 2: Date="2-February";
break;
case 3: Date="3-march";
break;
case 4: Date="4-April";
break;
case 5: Date="5-May";
break;
case 6: Date="6-June";
break;
case 7: Date="7-July";
break;
case 8: Date="8-August";
break;
case 9: Date="9-September";
break;
case 10: Date="10-october";
break;
case 11: Date="11-november";
break;
case 12: Date="12-December";
break;
default:
System.out.println("enter correct value");
}
System.out.println("present month is:"+Date);
}
}
