package Demo;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=scanner.nextInt();//local variable
		if(year%400==0)
		{
			System.out.println(year+" is a leap year");
		}
		else if(year%100==0)
		{
			System.out.println(year+" is a century year");			
		}
		else if(year%4==0)
		{
			System.out.println(year+" is a leap year");	
		}
		else
		{
			System.out.println(year+" is neither a leap nor a century year");
		}
		
	}

}
