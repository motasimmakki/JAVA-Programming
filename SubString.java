import java.util.Scanner;
class SubString{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String To Get sub String From That :");
        String string=scanner.nextLine();
        
        String subString=string.substring(2,10);
        System.out.println("Sub String From The Entered String is : "+subString);
	}
}