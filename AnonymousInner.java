class AnonymousInner{
	int x=10;
	AnonymousInner(){
		S.o.pln("Outer Class Constructor !");
	}
	{
		S.o.pln("This Is Innit Block Of Outer Class !");
	}
	void printX(){
		S.o.pln("Value Of x : "+x);
	}
	public static void main(String[] args) {
		AnonymousInner i=new AnonymousInner(){
			int x=20;
			{
				S.o.pln("This Is Innit Block Of Anonymous Inner Class !");
			}
			void printX(){
				S.o.pln("Value Of x : "+x);
			}
		};
		i.printX();
	}
}