import java.util.Scanner;
class Odd_in_range{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Odd numbers between 1 to 100 :");
int i=1;
int j=100;
while(i<=j){
    if(i%2!=0){
    System.out.println(i);
    }
    i++;
   }
}
}