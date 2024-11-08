import java.util.Scanner;
class Natural_num_sum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int i=1;
while(i<=n){

sum=sum+i;
i=i+1;
}
System.out.println("Sum of the n natural numbers is: "+sum);
}
}
