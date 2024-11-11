import java.util.*;
class Search{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter array size:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the values to store in array:");
for(int i=0;i<n;i++){

a[i]=s.nextInt();
}
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}

System.out.println("\n Enter number for search in array:");
int num=s.nextInt();
int j;
for(j=0;j<n;j++){
if(num==a[j]){
System.out.println("number found");
break;
}
}
if(j==n){
System.out.println(num+" number not found");
}
}
}


