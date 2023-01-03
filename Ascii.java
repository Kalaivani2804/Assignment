package Demo;

import java.util.Scanner;
public class Ascii 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any character : ");
		String str=scanner.next();
		char ch=str.charAt(0);
	//	char ch=scanner.next().charAt(0);
		int ascii=(int)ch;
		System.out.println(ascii);
		//if logic implementation
		if ((ascii >=65)&&(ascii<=90))
				{
				System. out.println("capital letter");
				}
				else if ((ascii>=97)&&(ascii<=122))
				{
				System. out.println("small letter");
				}
				else if ((ascii>=48)&&(ascii<=57))
				{
				System. out.println("digit");
				}
				else if ((ascii>=0)&&(ascii<=127))
				{
				System. out .println("special  symbols");
				}
				
	}
}
