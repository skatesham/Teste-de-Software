
public class main {
	
	public static void n(C c){
		c.w();
	}

	public static void main(String[] args) {
		B b = new B();
		b.z();
		b.x();
		b.y();
		b.w();
		
		n(b);
		D d = new D();
		n(d);
		System.out.println(b.getClass());
	}

}
