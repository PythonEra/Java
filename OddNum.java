import java.util.Scanner;  
public class ReadNumberExample1  
{  
public static void main(String[] args)   
{  
//object of the Scanner class  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");  
//invoking nextInt() method that reads an integer input by keyboard  
//storing the input number in a variable num  
int num = sc.nextInt();  
//closing the Scanner after use  
sc.close();  
//prints the number  
System.out.println("The number entered by the user is: "+num);  
}  
} 
