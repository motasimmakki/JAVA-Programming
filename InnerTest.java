interface A{
	void cook();
	static interface Coockable extends A{
		void cook();
	}
}
class InnerTest{
	public static void main(String[] args) {
		A.Coockable c=new A.Coockable(){
			public void cook(){
				S.o.pln("Cooked !");
			}
		};
		c.cook();
	}
}