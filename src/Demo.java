
public class Demo {

	private int x, y = 5;

	public Demo(int a, int b) {
		x = a;
		y = b;
	}

	public void show() {
		int x=55;
		System.out.println(this.x + "," + y);
	}

	public static void main(String[] args) {
		
		Demo d1=new Demo(10,20);
		Demo d2=new Demo(30,40);
		Demo d3=new Demo(50,60);
		d1.show();
		d2.show();
		d3.show();
		
		/*Demo d1;
		new Demo(10, 20);
		Demo d2 = new Demo(30, 40);
		Demo d3 = d2;
		d1 = d2;
		d1.show();
		d2.show();
		d3.show();
		d3 = new Demo(50, 60);
		System.out.println("______________________________________");
		d1.show();
		d2.show();
		d3.show();
		System.out.println("______________________________________");
		d2 = d3;
		d1.show();
		d2.show();
		d3.show();
		System.out.println("______________________________________");
		d1 = new Demo(70, 80);

		//

*/	}

}
