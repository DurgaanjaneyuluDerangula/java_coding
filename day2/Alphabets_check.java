import java.util.*;
class Alphabets_check{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter alphabet");
char l=s.next().charAt(0);
int l1=(int) l;
if((l1>=65 && l1<=90) || (l1>=97 && l1<=122)){
System.out.println(l+" is a alphabet");
}
else{
System.out.println(l+" is not a alphabet");
}
}
}