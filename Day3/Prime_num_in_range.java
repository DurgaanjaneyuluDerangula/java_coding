import java.util.*;
class Prime_num_in_range{
public static void main(String args[]){
Scanner td=new Scanner(System.in);
System.out.println("Enter a number");
int num=td.nextInt();
for(int i=1;i<=num;i++){
int count=0;
for(int j=1;j<=i;j++){
if(i%j==0){
count=count+1;
}
}
if(count==2){
System.out.println(i+" is a prime number");
}
}
}
}