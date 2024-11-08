import java.util.*;
class Palindrome
{
public static void main(String args[]){
Scanner td=new Scanner(System.in);
System.out.println("enter a number");
int num=td.nextInt();
int rem=0;
int rev=0;
int num2=num;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;

}
if(num2==rev){
System.out.println(num2+" is a palindrome number");
}
else{
System.out.println(num2+" is not a palindrome number");
}
}
}