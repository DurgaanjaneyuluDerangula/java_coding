import java.util.*;
class Rev_num
{
public static void main(String args[]){
Scanner td=new Scanner(System.in);
System.out.println("enter a num");
int num=td.nextInt();
int rem=0;
int rev=0;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;

}
System.out.println(rev);
}
}