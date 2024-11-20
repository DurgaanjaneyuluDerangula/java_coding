import java.util.Scanner;
class First_Last_digit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int num=sc.nextInt();
int num1=num;
int num2=0;
int count=0;
int count1=0;
while(num>0){
    int rem=num%10;
    num2=num2*10+rem;
  count=count+1;
    num=num/10;
   }
  System.out.println("First and Last digits are :");
  while(num2>0){
    int rem1=num2%10;  
  count1=count1+1;
  if(count1==1 || count1==count){
      System.out.println(rem1);
  }
    num2=num2/10;
   }
}
}