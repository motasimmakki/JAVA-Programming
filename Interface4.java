interface myInterface1{
	public void method1();
}

interface myInterface2{
	public void method2();
}

interface myInterface3 extends myInterface1,myInterface2{
	public void method3();
}

class Interface4 implements myInterface3{
	public void method1(){
		System.out.println("This Method Is Declared In Interface 1.");
	}
	public void method2(){
		System.out.println("This Method Is Declared In Interface 2.");
	}
	public void method3(){
		System.out.println("This Method Is Declared In Interface 3.");
	}
	public void myClassMethod(){
		System.out.println("This Method Is Defined In My Class.");
	}
	public static void main(String[] args) {
		Interface4 obj=new Interface4();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.myClassMethod();
	}
}
