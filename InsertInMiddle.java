import java.util.Scanner;
class InsertInMiddle{
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter String :");
        String s1=scanner.nextLine();
        System.out.println("Enter String And Index To Insert It In The Middle Of Previous String :");
        String s2=scanner.nextLine();
        int index=scanner.nextInt();
        int length=s1.length();
        String newString=s1.substring(0,index)+s2+s1.substring(index,length);
        System.out.println("New String is : "+newString);
	}
}