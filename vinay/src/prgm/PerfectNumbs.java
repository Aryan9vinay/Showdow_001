package prgm;
import java.util.Scanner;
public class PerfectNumbs {

public static int getfact(int d)
{
int fact=1;
while(d>1)
{
fact=fact*d;
d--;
}
return fact;
}
static void perfect(int n)
{
int sum=0;
int temp=n;
while(n>0)
{
int d=n%10;
sum=sum + getfact(d);
n=n/10;

}
if(sum==temp){
System.out.println("the no is perfect");
}

else 
System.out.println("the no is not perfect ");
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
perfect(n);

}


}
