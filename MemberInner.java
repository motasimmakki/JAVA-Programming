class MemberInner{
	int x=10;
	class Inner{
		// int x=20;
		Inner(){
			S.o.pln("Inner Class Constructor !");
		}

		void printX(){
			S.o.pln("Value Of x : "+x);
		}
	}
	// void method(){
	// 	Inner i=new Inner();
	// 	i.printX();
	// }
	public static void main(String[] args) {
		// MemberInner obj=new MemberInner();
		// // obj.method();
		// MemberInner.Inner objInner=obj.new Inner();
		// objInner.printX();
		new MemberInner().new Inner().printX();
	}
}