import java.util.Scanner;
class MethodOverloading{
	public float operation(float number){
		return (number*number);
	}
	public float operation(float a,float b){
		return (a+b);		
	}
	public float operation(float number1,
		float number2,float number3){
		return (number1*number2*number3);
	}
	public static void main(String[] args) {	
		MethodOverloading obj=new MethodOverloading();
		System.out.println("\nTo Find Square Of A No.:");
		System.out.println("\nEnter A Number :");	
		Scanner Sobj=new Scanner(System.in);
		Float square=Sobj.nextFloat();
		System.out.println("\nSquare Of A Number Is : "+obj.operation(square));
		System.out.println("\nTo Find Sum Of Two No. :");
		System.out.println("\nEnter First Number :");
		Float add1=Sobj.nextFloat();
		System.out.println("\nEnter Second Number :");
		Float add2=Sobj.nextFloat();
		System.out.println("\nAddition Of Two Number Is : "+obj.operation(add1,add2));
		System.out.println("\nTo Find Multiplication Of Three No. :");
		System.out.println("\nEnter First Number :");
		Float mul1=Sobj.nextFloat();
		System.out.println("\nEnter Second Number :");
		Float mul2=Sobj.nextFloat();
		System.out.println("\nEnter Third Number :");
		Float mul3=Sobj.nextFloat();
		System.out.println("\nMultiplication Of Three Number Is : "+obj.operation(mul1,mul2,mul3));
	}
}