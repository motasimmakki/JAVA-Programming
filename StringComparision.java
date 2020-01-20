import java.util.Scanner;
class StringComparision{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First String To Compare :");
        String s1=scanner.nextLine();
        System.out.println("Enter Second String To Comapre :");
        String s2=scanner.nextLine();

        int result=s1.compareTo(s2);

        if(result==0)
       		System.out.println("Both the Strings are Same.");
       	else if(result>=0)
       		System.out.println(s2+" comes before "+s1);
       	else
       		System.out.println(s1+" comes before "+s2);
	}
}