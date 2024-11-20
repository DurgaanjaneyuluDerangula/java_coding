import java.util.Scanner;
class Natural_num_rev{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");
int n=sc.nextInt();
int i=1;
while(n>=i){
    System.out.println(n);
    n--;
}
}
}