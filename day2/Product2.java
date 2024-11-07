import java.util.Scanner;
class Product2{
public static void main(String args[]){
int p_no;
String p_name;
float p_cost;
float quantity;
Scanner sc=new Scanner(System.in);
System.out.println("enter pid: ");
p_no=sc.nextInt();
System.out.println("enter p_name: ");
p_name=sc.next();
System.out.println("enter p_cost: ");
p_cost=sc.nextFloat();
System.out.println("enter quantity: ");
quantity=sc.nextFloat();
System.out.println("pid: "+p_no);
System.out.println("p_name: "+p_name);
System.out.println("p_cost: "+p_cost);
System.out.println("quantity: "+quantity);
float bill=p_cost*quantity;
System.out.println("Total amount: "+bill);
}
}