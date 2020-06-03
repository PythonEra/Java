import java.util.Scanner;
class NoPrime
{
public static void main(String args[])
{
int a;
boolean isPrime = ture;
Scanner sc = new Scanner(System.in);
System.out.pirntln("Enter any number");
int no = sc.nextInt();
sc.close();
for(int x = 2; x<=num/2; x++)
{
a = no % x;
if(a==0)
{
isPrime = false;
break;
}
}
if(isPrime)
System.out.println(no + "  is a Prime Number");
else
System.out.println(no + "is not a Prime no");
}
}
