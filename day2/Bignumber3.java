import java.util.Scanner;
class Bignumber3{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
System.out.println("Please Enter a first number");
int num1=n.nextInt();
System.out.println("Please Enter a second number");
int num2=n.nextInt();
if(num1>num2){
System.out.println(num1+" is a big number");
}
else if(num2>num1){
System.out.println(num2+" is a big number");
}
else{
System.out.println("Both numbers are equal");
}
}
}