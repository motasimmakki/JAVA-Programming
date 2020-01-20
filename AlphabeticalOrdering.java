import java.util.Scanner;
public class AlphabeticalOrdering{
    public static void main(String[] args){
        int n;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Strings you want to enter:");
        n=s.nextInt();
        String string[]=new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter all the Strings to arrange them in Alphabetic Order :");
        
        for(int i=0;i<n;i++)
            string[i]=s1.nextLine();
        
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (string[i].compareTo(string[j])>0){
                    temp=string[i];
                    string[i]=string[j];
                    string[j]=temp;
                }
            }
        }

        System.out.println("Strings in Alphabetical Order are :");
 
        for (int i=0;i<n-1;i++)
            System.out.print("["+string[i] + "]\t");
 
        System.out.print("["+string[n-1]+"]");
    }
}