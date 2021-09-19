class Account{
	private String accName, accId;
	private int ammount;
	Transaction [] listOfTransaction = new Transaction[50];
	int totalNumberOfTransaction;
	
	void addTransaction(Account sender, Account receiver, int amount,String info){
		listOfTransaction[totalNumberOfTransaction++] = new Transaction(sender,receiver,amount,info);
	}
	void showAllTranscation(){
		for(int i=0; i<totalNumberOfTransaction;i++)
			listOfTransaction[i].showInfo();
	}
	public Account(){
		ammount = 0;
	}
	public Account(String an, String aid, int a){
		accName = an;
		accId = aid;
		ammount = a;
	}
	void show(){
		System.out.println("Account Name: "+accName);
		System.out.println("Account ID: "+accId);
		System.out.println("Balance: "+ammount);
	}
	void deposit(int balance){
		ammount+=balance;
		addTransaction(this,this,balance,"deposit");
	}
	void withdraw(int balance){
		ammount-=balance;
		addTransaction(this,this,balance,"withdraw");
	}
	String getAccName(){
		return accName;
	}
	public static void main(String a[]){
		Account ob = new Account("Test", "00-00000-0", 1500);
		ob.show();
		ob.deposit(400);
		ob.show();
		ob.withdraw(700);
		ob.show();
		ob.showAllTranscation();
	}
}