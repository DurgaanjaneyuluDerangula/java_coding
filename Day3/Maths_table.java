import java.util.Scanner;
class Maths_table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the table");
int table=sc.nextInt();
System.out.println("Enter the number of values you want");
int n=sc.nextInt();


int mul;
int i=1;
while(i<=n){
mul=i*table;
System.out.println(table+"*"+i+"="+mul);
i=i+1;
}
}
}