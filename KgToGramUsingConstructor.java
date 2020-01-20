import java.util.Scanner;

class KgToGramUsingConstructor{

	float weightInGram;

	KgToGramUsingConstructor(float weight){

		weightInGram=weight*1000;

	}	

	public static void main(String[] args) {
		
		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter Weight In Kg To Convert It Into Gram :");
		float weightInKg=Sobj.nextFloat();

		KgToGramUsingConstructor Myobj=new KgToGramUsingConstructor(weightInKg);

		System.out.println("1kg Of Weight Is = "+Myobj.weightInGram+"g");

	}

}