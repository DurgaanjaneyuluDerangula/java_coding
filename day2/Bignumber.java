import java.util.Scanner;
class Bignumber{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
System.out.println("Please Enter a first number");
int num1=n.nextInt();
System.out.println("Please Enter a second number");
int num2=n.nextInt();
if(num1>num2){
System.out.println(num1+" is a big number");
}
else{
System.out.println(num2+" is a big number");
}
}
}