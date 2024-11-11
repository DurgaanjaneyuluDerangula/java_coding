import java.util.*;
class Binarysort{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter array size:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the values to store in array:");
for(int i=0;i<n;i++){

a[i]=s.nextInt();
}
System.out.println("Before sorting:");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.print("\n ");
for(int i=0;i<n-1;i++){
for (int j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("after Bubble sort:");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
}

