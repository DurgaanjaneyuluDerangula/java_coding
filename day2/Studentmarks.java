import java.util.Scanner;
class Studentmarks{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter student id: ");
int s_id=sc.nextInt();
System.out.println("enter student_name: ");
String s_name=sc.next();
System.out.println("enter english marks: ");
float eng=sc.nextFloat();
System.out.println("enter telugu marks: ");
float tel=sc.nextFloat();
System.out.println("enter hindi marks: ");
float hin=sc.nextFloat();

float total=eng+tel+hin;
float avg=total/3;
System.out.println("student id: "+s_id);
System.out.println("student_name: "+s_name);
System.out.println("english marks: "+eng);
System.out.println("telugu marks: "+tel);
System.out.println("hindi marks: "+hin);
System.out.println("Total marks: "+total);
System.out.println("average marks: "+avg);
}
}