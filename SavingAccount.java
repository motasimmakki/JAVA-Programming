class SavingAccount extends BankAccount{
	public void getInterestRateByTimePeriod(float time){
 		if(this.getClass().getName()=="SavingAccount"){
	 		System.out.println("*******************************************************");
			System.out.println("Interest Of Your Saving Account At Rate(4%) And Time Period("+time+" Years) Is : "
				+(this.balanceRemaining*0.04f*time));
			System.out.println("*******************************************************");
 		}
 		else{
 			System.out.println("*******************************************************");
 			System.out.println("Oops ! ...You Are Having A Current Account !");
 			System.out.println("No Interest On This Type Of Account !!!");
 			System.out.println("*******************************************************");
 		}
	}
}