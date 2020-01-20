import java.util.Scanner;
class StringConcatination{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First String To Concatinate :");
        String s1=scanner.nextLine();
        System.out.println("Enter Second String To Concatinate :");
        String s2=scanner.nextLine();

        String sConcatinate=s1.concat(s2);

        System.out.println("Concatinated String is : "+sConcatinate);
	}
}