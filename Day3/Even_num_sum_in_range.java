import java.util.Scanner;
class Even_num_sum_in_range{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number :");
int num=sc.nextInt();
int i=1;
int sum=0;
while(i<=num){
    if(i%2==0){
    sum=sum+i;
    }
    i++;
   }
   System.out.println("sum of even numbers in the range of "+num+" is :"+sum);
}
}