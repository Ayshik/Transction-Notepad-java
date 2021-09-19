class Transaction{
	private Account sender;
	private Account receiver;
	private int amount;
	private String additionalInfo;
	Transaction(){}
	Transaction(Account sender,Account receiver,int amount,String additionalInfo){
		this.sender=sender;
		this.receiver=receiver;
		this.amount=amount;
		this.additionalInfo=additionalInfo;
	}
	void showInfo(){
		System.out.println("Sender: "+sender.getAccName());
		System.out.println("Receiver: "+receiver.getAccName());
		System.out.println("Ammount: "+amount);
		System.out.println("Info: "+additionalInfo);
	}
}