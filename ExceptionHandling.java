class ExceptionHandling{
	public int computeDivision(int a,int b){
		int division=0;
		try{
			if((b>='A')&&(b<='Z')||(b>='a')&&(b<='z')||(a>='A')&&(a<='Z')||(a>='a')&&(a<='z')){
				System.out.println("******************************************");
				throw new IllegalArgumentException("Character Is Not Allowed.");
			}
			else if(b==0){
				System.out.println("******************************************");
				throw new ArithmeticException("Cannot Divide By Zero.");
			}
			division=a/b;
			System.out.println("Division Is : "+division);
		}
		catch(ArithmeticException ax){
			System.out.println("ArithmeticException Occured.\nException Type :\n"+ax);
				System.out.println("******************************************");
		}
		catch(IllegalArgumentException iax){
			System.out.println("IllegalArgumentException Occured.\nException Type :\n"+iax);
				System.out.println("******************************************");
		}
		catch(Exception e){
			System.out.println("Exception Occured.\nException Type :\n"+e);
				System.out.println("******************************************");
		}
		return division;
	}
	public static void main(String[] args) {
		ExceptionHandling obj=new ExceptionHandling();
		obj.computeDivision(10,0);
		obj.computeDivision('d',5);
		obj.computeDivision(60,'k');
		obj.computeDivision(10,5);
	}
}