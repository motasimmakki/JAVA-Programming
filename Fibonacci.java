import java.util.*;

interface MakeFibonable{
	int getFibonacci(int firstTerm,int secondTerm);
}

class Fibonacci{
	public static void main(String[] args) {
		int firstTerm=0,secondTerm=1,nextTerm;
		
		MakeFibonable f1=(f,s)->(int)f+s;

		System.out.print(firstTerm+"-->"+secondTerm);
		for(int i=0;i<10;i++){
			nextTerm=f1.getFibonacci(firstTerm,secondTerm);
			System.out.print("-->"+nextTerm);
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}
}