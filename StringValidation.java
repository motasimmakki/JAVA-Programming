import java.util.*;
class StringValidation{
	public char[] sortArray(char[] array){
		Arrays.sort(array);
		return array;
	}
	public boolean isValid(String str){
		char[] strArray=str.toCharArray();
		strArray=sortArray(strArray);
		S.o.pln("Sorted Character Of String Is :");
		for(int i=0;i<strArray.length;i++){
			S.o.p(strArray[i]+" ");
		}
		S.o.pln();
		int maxCount=1,i=0,j=0,prevCount=0;
		for(i=0;i<strArray.length-1;i=j){
			prevCount=maxCount;
			maxCount=1;
			for(j=i+1;j<strArray.length&&
				Character.compare(Character.toUpperCase(strArray[i]),Character.toUpperCase(strArray[j]))==0;j++){
				maxCount-=-1;
			}
		// S.o.pln(maxCount);
		// S.o.pln(prevCount);
			if((maxCount!=prevCount)&&(maxCount!=prevCount+1)&&(maxCount!=prevCount-1)&&(i!=0))
				return false;
		}
		if((maxCount!=prevCount)&&(maxCount!=prevCount+1)&&(maxCount!=prevCount-1))
				return false;
		return true;
	}
	public static void main(String[] args) {
		StringValidation obj=new StringValidation();
		S.o.pln("Enter To Check Weather The String Is Valid Or Invalid !");
		String str=new Scanner(System.in).nextLine();
		if(obj.isValid(str)){
			S.o.pln("Your Entered String "+str+" is Valid String.");
		}
		else{
			S.o.pln("Your Entered String "+str+" is Invalid String.");
		}
	}
}