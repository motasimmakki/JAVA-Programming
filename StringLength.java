import java.util.Scanner;
class StringLength{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String To Find It's Length :");
        String string=scanner.nextLine();

        int length=string.length();

		System.out.println("Length Of The Entered String Is :"+length);
	}
}