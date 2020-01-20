class ConstructorOverloading{
	String name;
	int serialNo;
	ConstructorOverloading(){
		System.out.println("Default Constructor is Invoked.");
	}
	ConstructorOverloading(String name,ConstructorOverloading constructorOverloading){
		constructorOverloading.name=name;
		System.out.println("Constructor with Single Parameter is Invoked.");
	}
	ConstructorOverloading(int serialNo,ConstructorOverloading constructorOverloading){
		constructorOverloading.serialNo=serialNo;
		System.out.println("Constructor with Two Parameter is Invoked.");
	}
	public static void main(String[] args) {
		ConstructorOverloading constructorOverloading=new ConstructorOverloading();
		new ConstructorOverloading("Motasim",constructorOverloading);
		new ConstructorOverloading(46,constructorOverloading);
		System.out.println("Name is : "+constructorOverloading.name+"\nSerial No. is :"+constructorOverloading.serialNo);
	}
}