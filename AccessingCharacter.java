import java.util.Scanner;
class AccessingCharacter{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
        String string=scanner.nextLine();
        System.out.println("Enter The Index To Access The Letter In The String :");
        int index=scanner.nextInt();
        char ch=string.charAt(index-1);
        System.out.println("Character At Index "+index+" In The Entered String is : "+ch);
	}
}