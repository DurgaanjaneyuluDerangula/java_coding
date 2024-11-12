import java.util.Scanner;
class Div_nums{
public static void main(String args[]){
Scanner c=new Scanner(System.in);
System.out.println("Enter a number");
int num=c.nextInt();
if(num%5==0 && num%11==0){

System.out.println(num+" is divisible by both 5 and 11");

}

else{
System.out.println(num+" is not divisible by both 5 and 11");
}
}
}