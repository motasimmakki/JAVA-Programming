import java.util.Scanner;
class SmallestInteger{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Real Number to find it's smallest Integer greater than that :");
		double value=scanner.nextDouble();
		double temp=value;
		int i=0,integetValue=0;
		String strValue=Double.toString(value);
		for(i=0;i<strValue.length();i++){
			if(strValue.charAt(i)=='.'){
				break;
			}
		}
		System.out.println(strValue.charAt(i));
		if(strValue.charAt(++i)=='0'){
			System.out.println("Smallest Integer Greater than "+temp+" is : "+value);
			System.out.println("code run");
		}
		else{
			integetValue=(int)++value;
			System.out.println("Smallets Integer Greater than "+temp+" is : "+integetValue);
		}
	}
}