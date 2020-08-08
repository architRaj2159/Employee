interface Math{
	public int calculate(int x, int y);
}

class innerClass1 implements Math{

	@Override
	public int calculate(int x, int y) {
		System.out.println(x+y);
		return (x+y);
	}
	
}


public class innerClass {
	public static void main(String[] args) {
		
		
		Math mq = new innerClass1();
		mq.calculate(5,6);
		
		
		
		Math mm = new Math() {
			
			@Override
			public int calculate(int x, int y) {
				System.out.println(x+y);
				return (x+y);
				
			}
		}; 
		mm.calculate(32, 12);
		
		Math m1 = (x,y) -> x+y;
		System.out.println(m1.calculate(2, 4));
		
		
		

	}
}
