
public class Calculator {
	public int add( int x, int y) {
	return (x+y);	
	}
	
	public int sub(int x, int y) {
		return (x - y);
	}
	
	public float div(int x, int y) {
		return (x/y);
	}
	
	public int mul(int x, int y) {
		return (x*y);
	}
	
	public static int add2( int x, int y) {
		return (x+y);	
		}
		
		public static int sub2(int x, int y) {
			return (x - y);
		}
		
		public static float div2(int x, int y) {
			return (x/y);
		}
		
		public static int mul2(int x, int y) {
			return (x*y);
		}

	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int a = c.add(3,6);
		int b = c.sub(7,2);
		float d = c.div(6,3);
		int e = c.mul(3,4);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		
		
		System.out.println(c.add(20, 30));
		System.out.println(c.sub(30, 20));
		System.out.println(c.div(20, 10));
		System.out.println(c.mul(2, 3));

		/* For static methods we don't have to create objects we
		can direct write class name and the method name like we did below*/
		System.out.println(Calculator.add2(2, 3));
		System.out.println(Calculator.sub2(4, 3));
		System.out.println(Calculator.div2(4, 2));
		System.out.println(Calculator.mul2(2, 3));
		
		
		
	}

}
