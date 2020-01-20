class BankAccount{
	public String depositor;
	public String accountType;
	public int accountNo;
 	public float balanceRemaining;
 	public void initializeBankAcount(String depositor,String accountType,
 		int accountNo,float balanceRemaining){
 		this.depositor=depositor;
 		this.accountType=accountType;
 		this.accountNo=accountNo;
 		this.balanceRemaining=balanceRemaining;
 	}
 	public void depositeAmount(float amount){
 		balanceRemaining+=amount;
 		System.out.println("*******************************************************");
 		System.out.println("You Have Successfully Deposited "+amount+" Rs To Your Account.");
 		System.out.println("*******************************************************");
 	}
 	public void withdrawlAmount(float amount){
 		if(balanceRemaining>2000&&balanceRemaining>=amount){
 			balanceRemaining-=amount;
 			System.out.println("*******************************************************");
 			System.out.println("You Have Withdrawl "+amount+" Rs From Your Account.");
 			System.out.println("*******************************************************");
 		}
 		else{
 			System.out.println("*******************************************************");
 			System.out.println("Sorry ! ...You Don't Have Enough Amount !");
 			System.out.println("*******************************************************");
 		}
 	}
 	public void displayDetails(){
 		System.out.println("*******************************************************");
 		System.out.println("Depositor Name : "+depositor+"\nAccount Type : "+
 			accountType+"\nAccount No. : "+accountNo+"\nRemaining Balance : "+balanceRemaining);
 		System.out.println("*******************************************************");

 	}
}