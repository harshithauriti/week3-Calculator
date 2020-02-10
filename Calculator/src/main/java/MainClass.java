import java.util.*;
public class MainClass {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("*****CALCULATOR******");
	System.out.println("Enter the first Number: ");
	int a=sc.nextInt();
	System.out.println("Enter the second Number: ");
	int b=sc.nextInt();
	System.out.println("Enter your Choice: ");
	Add add=new Add();
	System.out.println("1. Addition");
	Sub sub=new Sub();
	System.out.println("2. Subtract Second number from first number.");
	Mul mul=new Mul();
	System.out.println("3. Multiplication");
	Div div=new Div();
	System.out.println("4. Divide First number with second number.");
	Mod mod=new Mod();
	System.out.println("5. Modular Division");
	int k=sc.nextInt();
	int value;
	if(k==1)
	{
		value=add.Calculate(a,b);
		System.out.println("Sum of first number and second number is: "+value);
	}
	else if(k==2)
	{
		value=sub.Calculate(a,b);
		System.out.println("Difference between first number and second number is: "+value);
	}
		
	else if(k==3)
	{
		value=mul.Calculate(a,b);
		System.out.println("product of first number and second number is: "+value);
	}
	else if(k==4)
	{
		value=div.Calculate(a,b);
		System.out.println("Quotient when first number is divided by second number is: "+value);
	}
	else if(k==5)
	{
		value=mod.Calculate(a,b);	
		System.out.println("Remainder when first number is divided by second number is: "+value);
	}
	sc.close();
}
}
