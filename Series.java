import java.util.Scanner;
class Series{
	public double getValue(int n){
		double value=0.0;
		for(int i=1;i<=n;i++){
			value+=(1.0/i);
		}
		return value;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Series series=new Series();
		System.out.println("Series is : (1/1) + (1/2) + (1/3) + ... (1/n) ,");
		System.out.println("Enter the value of 'n' :");
		int n=scanner.nextInt();
		double value=series.getValue(n);
		System.out.println("Value of Harmonic series Where n = "+n+" is : "+value);
	}
}