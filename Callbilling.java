package Demo;

import java.util.Scanner;
public class Callbilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total number of calls : ");
		int calls=scanner.nextInt();
		double billingAmount=0;
		if(calls>=0 && calls<=100)
		{
			billingAmount=200;
		}
		else if(calls>100 && calls<=150)
		{
			//calls-=100;
			calls=calls-100;
			billingAmount=200+(calls*0.60);
		}
		else if(calls>150 && calls<=200)
		{
			calls-=150;
			billingAmount=200+(50*0.60)+(calls*0.50);
		}
		else if(calls>200)
		{/*
		245=100+50+50+45
		=200+30+25+18
		=230+43=273
		
		*/
		
			calls-=200;
			billingAmount=200+(50*0.60)+(50*0.50)+(calls*0.40);
		}
		else
		{
			billingAmount=0;
			System.out.println("Invalid input");
		}
		System.out.println("The billing amount payable is Rs."+billingAmount);
		
	}

}
