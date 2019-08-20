
public class Demo {

	private int x, y;

	private static Demo ob1,ob2;
	
	public boolean equals(Demo tmp) {
		
		return x==tmp.x && y==tmp.y;
	}
	
	public static void display(Demo tmp) {
		System.out.println(tmp.x+","+tmp.y);
	}
	
	public Demo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void show() {
		display(this);
	}

	public static void main(String[] args) {
	
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1==ob2);
		System.out.println(ob1.equals(ob2));
		/*
		Demo d1=new Demo(10,20);
		Demo d2=new Demo(10,20);
		Demo d3=d2;
		
		boolean res1=d1.equals(d2);
		boolean res2=d2.equals(d3);
				
		//boolean res1=(d1==d2);
		//boolean res2=(d2==d3);
		
		System.out.println(res1);
		System.out.println(res2);
		*/
		
		
		
	}

}
