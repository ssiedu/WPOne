//WPOne

public class Account
{
	private int ano;
	private String name;
	private int balance;
						
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