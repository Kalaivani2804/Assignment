package Demo;
public class EvenOdd {

	public static void main(String[] args) 
	{//even/Odd
		int count=0;
		System.out.println("Odd Numbers between 1 to 20");
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println("\nThe total count of odd numbers is "+count);
}
	}