class CurrentAccount extends SavingAccount{
	public static void main(String[] args) {
		CurrentAccount currentAccount=new CurrentAccount();
		currentAccount.initializeBankAcount("Muntasir","Current",12345,80000);
		currentAccount.displayDetails();
		currentAccount.withdrawlAmount(90000);
		currentAccount.displayDetails();
		currentAccount.getInterestRateByTimePeriod(2);
	}
}