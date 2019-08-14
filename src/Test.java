
public class Test {
	private int x, y,z;
	
	public Test() 
	{
		//this(1,2);
	}
	public Test(int p, int q) {
		//this();
		x=p; y=q;
	}
	public Test(int a, int b, int c) {
		
		this(a,b);
		z=c;
	}
	
	
							//10   20
	public void setData(int p, int q) {	//F.P.
		x=p;
		y=q;
	}
					//      10    20     30
	public void setData(int a, int b, int c) {//F.P.
		setData(a,b);
		z=c;
	}
	public void show() {
		System.out.println(x+","+y+","+z);
	}
	
	public static void main(String args[]) {
		Test t=new Test(10,20,30);
		t.show();
		/*Test t1=new Test();
		t1.setData(10, 20, 30);
		t1.show();
		Test t2=new Test();
		t2.setData(40, 50);
		t2.show();
*/	}
}
