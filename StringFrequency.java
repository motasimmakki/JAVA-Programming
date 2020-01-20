import java.util.Scanner;

class StringFrequency{

	public String[] remove(String[] strArr,int index){
		String[] newStr=new String[strArr.length-1];
		for(int i=0,j=0;i<strArr.length;i++){
			if(i!=index){
				newStr[j]=strArr[i];
				j-=-1;
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StringFrequency obj=new StringFrequency();
		S.o.pln("Enter String to find frequency of words in it :");
		String str=scanner.nextLine();
		String[] strArr=str.split(" ");
		int freq=1;

		for(int i=0;i<strArr.length;i++){
			for (int j=i+1;j<strArr.length;j++) {
				if(strArr[i].compareTo(strArr[j])==0){
					freq-=-1;
					strArr=obj.remove(strArr,j);
				}
			}
			S.o.pln(strArr[i]+" - "+freq);
			freq=1;
		}

	}
}