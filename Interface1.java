interface myInterface{
	public void method();
}

class MyClass implements myInterface{
	
	public void method(){
		System.out.println("This Method Is Declared In Interface.");
	}

}
class Interface1 extends MyClass{
	public static void main(String[] args) {
		Interface1 obj=new Interface1();
		obj.method();
	}
}