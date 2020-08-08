
public class static_example {
	//static initializer block
	static {
		System.out.println("static block executed...!!!");
	}
	
	//no-static block
	
	{
		System.out.println("non static block executed!!!");
	}
	
	static_example(){
		System.out.println("Constructor executed");
	}
	
	public static void main(String[] args) {
		static_example s1 = new static_example();
		static_example s2 = new static_example();
	}

}
