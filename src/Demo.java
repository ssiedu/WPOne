
public class Demo {
	int x;
	
	public static void change(Demo obj) {
		obj.x++;
	}
	public static void change(int fp) {
		fp++;
	}
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.x=10;
		System.out.println(d1.x);
		change(d1);
		System.out.println(d1.x);
		
		/*int ap=10;
		System.out.println(ap);
		change(ap);
		System.out.println("After Call : ");
		System.out.println(ap);*/
		

	}

}
