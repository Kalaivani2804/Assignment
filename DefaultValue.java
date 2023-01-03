package Demo;

public class DefaultValue{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DefaultValues defaultValues=new DefaultValues();
			System.out.println("int : ["+defaultValues.num1+"]");
			System.out.println("byte : ["+defaultValues.b+"]");
			System.out.println("char : ["+defaultValues.ch+"]");
			System.out.println("double : ["+defaultValues.d+"]");
			System.out.println("long : ["+defaultValues.data+"]");
			System.out.println("short : ["+defaultValues.dummy+"]");
			System.out.println("float : ["+defaultValues.f+"]");
			System.out.println("boolean : ["+defaultValues.status+"]");
			System.out.println("String : ["+defaultValues.name+"]");
	
	
	}

}
class DefaultValues
{
	//whenever an instance for the class is created, memory to the instance variable is allocated and
	// they are initialized by a default value
	//no concept of garbage value is applicable in java
	String name;
	int num1;
	boolean status;
	char ch;
	long data;
	short dummy;
	byte b;
	float f;
	double d;	
}
