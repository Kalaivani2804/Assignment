package Demo;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scanner.nextInt();
		//prime number 1 and itself
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(num+" is prime number");
		}
		else	
		{
			System.out.println(num+" is not prime number");	
		}
		}}


