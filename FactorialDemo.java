import java.util.Scanner;
class factorial
{
public void fact()
{
int fact=1,n,i;
System.out.print("Enter the number: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("The factorial of "+n+" is: "+fact);
}
}
class FactorialDemo
{
public static void main(String [] args)
{
factorial f=new factorial();
f.fact();
}
}