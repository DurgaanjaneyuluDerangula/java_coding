//A=65 to 90 a=97 to 122
import java.util.*;
class Check_vowel{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Alphabet");
char l=s.next().charAt(0);
int l1=(int) l;
if((l1>=65 && l1<=90) || (l1>=97 && l1<=122)){
    if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'||l=='A'||l=='E'||l=='I'||l=='O'||l=='U'){
System.out.println(l+" is a vowel");
}
else{
    System.out.println(l+" is a consonent");
}
}

else{
System.out.println("Please enter a alphabet");
}
}
}