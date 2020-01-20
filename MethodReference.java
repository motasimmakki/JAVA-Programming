import java.util.*;

interface Interface1{
	void show();
}

interface Interface2{
	void show();
}

class MethodReference implements Interface1,Interface2{

	@Override
	public void show(){
		System.out.println("Overrided Interface 1 & 2");
	}

	public static void main(String[] args) {
		MethodReference obj=new MethodReference();

		Interface1 i1=obj::show;

		i1.show();

	}
}