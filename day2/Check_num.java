import java.util.Scanner;
class Check_num{
public static void main(String args[]){
Scanner c=new Scanner(System.in);
System.out.println("Enter a number");
int num=c.nextInt();
if(num>0){
System.out.println(num+" is a positive number");
}
else{
System.out.println(num+" is a negative number");
}
}
}