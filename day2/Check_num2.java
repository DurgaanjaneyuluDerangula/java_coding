import java.util.Scanner;
class Check_num2{
public static void main(String args[]){
Scanner c=new Scanner(System.in);
System.out.println("Enter a number");
int num=c.nextInt();
if(num%2==0){
System.out.println(num+" is a even number");
}
else{
System.out.println(num+" is a odd number");
}
}
}