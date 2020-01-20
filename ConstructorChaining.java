class ConstructorChaining{
	ConstructorChaining(){
		this(10);
		System.out.println("\nDefault Constructor.");
	}
	ConstructorChaining(int x){
		this(10,20);
		System.out.println("\nConstructor With One Parameter.");
	}
	ConstructorChaining(int x,int y){
		System.out.println("\nConstructor With Two Parameter.");
	}
	public static void main(String[] args) {			
		ConstructorChaining obj=new ConstructorChaining();
	}
}