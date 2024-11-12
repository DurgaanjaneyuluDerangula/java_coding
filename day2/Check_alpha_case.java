import java.util.*;
class Check_alpha_case{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Alphabet");
char l=s.next().charAt(0);
int l1=(int) l;
if(l1>=65 && l1<=90){
System.out.println(l+" is a Uppercase letter");
}
else if (l1>=97 && l1<=122){

  System.out.println(l+" is a lowercase letter");  
}

else{
System.out.println("Please enter a alphabet");
}
}
}