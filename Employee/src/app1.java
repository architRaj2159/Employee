class emp{
	int empno;
}

public class app1 {
	public static void main(String[] args) {
		emp e = new emp();
		e.empno = 1001;
		change(e);
		System.out.println(e.empno);
		
	}
	
	public static void change(emp emp1) {
		emp1 = new emp();
		emp1.empno = 2001;
		//emp1 = null;
	}

}
