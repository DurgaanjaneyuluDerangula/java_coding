import java.util.*;
class Prime_num{
public static void main(String args[]){
Scanner td=new Scanner(System.in);
System.out.println("Enter a number");
int num=td.nextInt();
int count=0;
for(int i=1;i<=num;++i){
if(num%i==0){
count=count+1;
}
}
if(count==2){
System.out.println(num+" is a prime number");
}
else{
System.out.println(num+" is not a prime number");
}
}
}