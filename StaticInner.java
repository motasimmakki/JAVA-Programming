interface OuterInterface{
	void outer();
	interface InnerInterface{
		void inner();
	}
}
class StaticInner implements OuterInterface,OuterInterface.InnerInterface{
	static int x=10;
	public void outer(){
		S.o.pln("This Is A Method Of Outer Interface");
	}
	public void inner(){
		S.o.pln("This Is A Method Of Inner Interface");
	}
	static class Inner{
		Inner(){
			S.o.pln("Inner Class Constructor !");
		}
		{
			S.o.pln("This Is Innit Block Of Static Inner Class !");
		}
		void printX(){
			S.o.pln("Value Of x : "+x);
		}
	}
	public static void main(String[] args) {
		// StaticInner.Inner i=new StaticInner.Inner();
		new StaticInner.Inner().printX();
		// InnerInterface i=new StaticInner();
		new StaticInner().inner();
		// OuterInterface o=new StaticInner();
		new StaticInner().outer();
	}
}