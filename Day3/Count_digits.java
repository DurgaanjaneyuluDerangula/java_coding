import java.util.Scanner;
class Count_digits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number :");
int num=sc.nextInt();
int num1=num;
int count=0;
while(num>0){
  count=count+1;
    num=num/10;
   }
   System.out.println("number of digits in the number "+num1+" is :"+count);
}
}