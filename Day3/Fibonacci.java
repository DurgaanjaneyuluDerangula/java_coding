import java.util.*;
class Fibonacci{
public static void main(String args[]){
Scanner td=new Scanner(System.in);
int num1=0,num2=1,num3;
System.out.println("please enter the range of fibonacci");
int count=td.nextInt();
System.out.println(num1);
System.out.println(num2);
for(int i=2;i<count;++i){
num3=num1+num2;
System.out.println(num3);
num1=num2;
num2=num3;
}
}
}
