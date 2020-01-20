class Customer extends SavingAccount{
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.initializeBankAcount("Motasim","Savings",74098,90000);
		customer.displayDetails();
		customer.withdrawlAmount(60000);
		customer.displayDetails();	
		customer.depositeAmount(20000);
		customer.displayDetails();
		customer.getInterestRateByTimePeriod(2);
	}
}