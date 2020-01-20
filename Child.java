class Parent{
	static{
		System.out.println("1");
	}
	public void show(){
		System.out.println("Parent :"+Thread.currentThread().getName());
	}
}

class Child extends Parent{
	static{
		System.out.println("2");
	}
	public void show(){
		System.out.println("Child :"+Thread.currentThread().getName());
		new Thread(new Parent()::show).start();
	}
	public static void main(String[] args) {
		Parent p=new Child();
		new Thread(p::show).start();
	}
}