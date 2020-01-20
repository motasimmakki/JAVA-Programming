interface myInterface1{
	public void method1();
}

interface myInterface2 extends myInterface1{
	public void method2();
}

class MyClassA{
	public void classAMethod(){
		System.out.println("This Method Is Defined In class A.");
	}
}

class MyClassB extends MyClassA implements myInterface2{
	public void classBMethod(){
		System.out.println("This Method Is Defined In class B.");
	}
	public void method1(){
		System.out.println("This Method Is Declared In Interface1.");
	}
	public void method2(){
		System.out.println("This Method Is Declared In Interface2");
	}
}

class Interface2 extends MyClassB{
	public void classCMethod(){
		System.out.println("This Method Is Defined In class C.");
	}
	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.classAMethod();
		obj.classBMethod();
		obj.classCMethod();
		obj.method1();
		obj.method2();
	}
}