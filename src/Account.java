//WPOne

public class Account
{
	private int ano;
	private String name;
	private int balance;
	private static int totalDeposits;
					
	public Account(Account tmp) {
		ano=tmp.ano;
		name=tmp.name;
		balance=tmp.balance;

	}
	
	public Account(int a, String b, int c) {
		ano=a; name=b; balance=c;
	}
	
	
	
	public static void display(Account...tmp) {
		
		for(int i=0; i<tmp.length; i++) {
			System.out.println(tmp[i].ano+","+tmp[i].name+","+tmp[i].balance);
		}
		/*
		for(Account account:tmp) {
			System.out.println(account.ano+"==>"+account.balance);
		}*/
	}
	public static void showAvg(Account...tmp) {
		int total=0;
		for(Account ac:tmp) {
			total=total+ac.balance;
		}
		int n=tmp.length;
		System.out.println("Avg of "+n+" : " + (total/n));
		
	}
	/*
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3, Account tmp4) {
		System.out.println("Avg of 4: "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
		//tmp2.balance++;
	}
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3) {
		System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
		//tmp2.balance++;
	}
	public static void showAvg(Account tmp1, Account tmp2) {
		System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
		//tmp2.balance++;
	}
	*/
	public static void showData(Account tmp)
	{
		System.out.println(tmp.ano+","+tmp.name+","+tmp.balance);
	}
	
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
	public static void withdraw(Account tmp,int amount) {
		if(tmp.balance>=amount) {
			System.out.println("Transaction Allowed For "+tmp.ano);
			tmp.balance=tmp.balance-amount;
		}else {
			System.out.println("Insufficient Balance In "+tmp.ano);
		}
	}
	public void setData(int a, String b, int c)
	{
		ano=a;
		name=b;
		balance=c;
	}

}