//WPOne

public class Account
{
	private int ano;
	private String name;
	private int balance;
	private static int totalDeposits;
	
	public static boolean isValidAmountForDeposit(int amountToCheck) {
		return amountToCheck>=500;
	}
	
	public void show() {
		System.out.println(balance);
		System.out.println(totalDeposits);
	}
	
	public static void showTotalDeposits() {
		System.out.println("TOTAL DEPOSITS : "+totalDeposits);
	}
	public void deposit(int amount) {
		balance=balance+amount;
		totalDeposits=totalDeposits+amount;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int a) {
		ano = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
			System.out.println("Transaction Allowed For "+ano);
			balance=balance-amount;
		}else {
			System.out.println("Insufficient Balance In "+ano);
		}
	}
	public void setData(int a, String b, int c)
	{
		ano=a;
		name=b;
		balance=c;
	}
	public void showData()
	{
		System.out.println(ano+","+name+","+balance);
	}
}