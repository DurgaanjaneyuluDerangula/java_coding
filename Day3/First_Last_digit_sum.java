import java.util.Scanner;
class First_Last_digit_sum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int num=sc.nextInt();
int num1=num;
int count=0;
int count1=0;
int sum=0;
int num2=num;
while(num>0){
  count=count+1;
    num=num/10;
   }
 
  while(num1>0){
    int rem=num1%10;  
  count1=count1+1;
  if(count1==1 || count1==count){
      sum=sum+rem;
  }
    num1=num1/10;
   }
 System.out.println("Sum of First and last digits of "+num2+" is :"+sum);
}
}