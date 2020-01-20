import java.util.Scanner;
class AppendAtEnd{
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter String :");
        String s1=scanner.nextLine();
        System.out.println("Enter String To Append It At The End Of Previous String :");
        String s2=scanner.nextLine();

        int length=s1.length();
        
        String newString=s1+s2;
        System.out.println("Appended String is : "+newString);
	}
}