import java.util.Scanner;
class Natural_num_mul{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int mul=1;
int i=1;
while(i<=n){

mul=mul*i;
i=i+1;
}
System.out.println("Multiplication value of the n natural numbers is: "+mul);
}
}