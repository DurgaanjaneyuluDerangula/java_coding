//A=65 to 90 a=97 to 122
//0=48 to 9=57
import java.util.*;
class Check_characters{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
char l=s.next().charAt(0);
int l1=(int) l;
if((l1>=65 && l1<=90) || (l1>=97 && l1<=122)){
System.out.println(l+"it is a alphabet");
}
else if(l1>=48 && l1<=57){
System.out.println(l+"it is a number");
}
else{
System.out.println(l+"it is a special character");
}
}
}