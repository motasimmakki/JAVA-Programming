interface myInterface{
	public void method();
}

class MyClassA implements myInterface{
	public void classAMethod(){
		System.out.println("This Method Is Defined In class A.");
	}
	public void method(){
		System.out.println("This Method Is Declared In Interface And It Is Defined In Class A.");
	}
}

class Interface3 implements myInterface{
	public void classBMethod(){
		System.out.println("This Method Is Defined In class B.");
	}
	public void method(){
		System.out.println("This Method Is Declared In Interface And It Is Defined In Class B");
	}
	public static void main(String[] args) {
		Interface3 obj=new Interface3();
		obj.classBMethod();
		obj.method();
	}
}
