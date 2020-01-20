import java.util.Scanner;

class KgToGramUsingObject{

	float getWeightInGram(float weight){

		return weight*1000;

	}

	public static void main(String[] args) {
		
		KgToGramUsingObject Myobj=new KgToGramUsingObject();

		Scanner Sobj=new Scanner(System.in);
		System.out.println("Enter Weight In Kg To Convert It Into Gram :");
		float weightInKg=Sobj.nextInt();

		float weightInGram=Myobj.getWeightInGram(weightInKg);

		System.out.println("1kg Of Weight Is = "+weightInGram+"g");

	}

}