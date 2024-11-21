import java.util.Scanner;
class Pro_of_digits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int num=sc.nextInt();
int num1=num;
int mul=1;
while(num>0){
    int rem=num%10;
    mul=mul*rem;
    num=num/10;
   }
  System.out.println("Product of the digits is : "+mul);
}
}