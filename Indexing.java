import java.util.Scanner;
class Indexing{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
        String string=scanner.nextLine();
        System.out.println("Enter The Letter To get The Index Of That Letter :");
        char ch=scanner.next().charAt(0);
        int indexedString=string.indexOf(ch);
        System.out.println("Index Of "+ch+" In The Entered String is : "+(indexedString+1));
	}
}