interface myParentInterface{
	public void method();
}
class AnonymousInner2{
	AnonymousInner2(){
		S.o.pln("Outer Class Constructor !");
	}
	{
		S.o.pln("This Is Innit Block Of Outer Class !");
	}
	void printX(myParentInterface ref){
		ref.method();
	}
	public static void main(String[] args) {
		new AnonymousInner2().printX(new myParentInterface(){
			int x=10;
			public void method(){
				S.o.pln("Value Of x : "+x);
			}
		});
	}
}