class LocalInner{
	int x=10;
	LocalInner(){
		S.o.pln("Outer Class Constructor !");
	}
	{
		S.o.pln("This Is Innit Block Of Outer Class !");
	}
	void method(){
		// int x=20;
		class Inner{
			// int x=30;
			Inner(){
				S.o.pln("Inner Class Constructor !");
			}
			{
				S.o.pln("This Is Innit Block Of Inner Class !");
			}
			void printX(){
				S.o.pln("Value Of x :"+x);
			}
		}

		// Inner i=new Inner();
		// i.printX();
		new Inner().printX();
	}
	public static void main(String[] args) {
		// LocalInner obj=new LocalInner();
		// obj.method();
		new LocalInner().method();
	}
}