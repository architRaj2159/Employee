import java.time.LocalDate;
public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Archit", 20000, LocalDate.of(2020, 06, 17));

	    Employee e2 = new Employee(200);
	    //e2.setPsno(200);
	    e2.setName("Sarthak");
	    e2.setSalary(15000);
	    e2.setDateofJoining(LocalDate.of(2020, 02, 02));
	    
	    System.out.println(e1.getPsno());
	    System.out.println(e1.getName());
	    System.out.println(e1.getSalary());
	    System.out.println(e1.getDateofJoining());
	    System.out.println(e2.getPsno());
	    System.out.println(e2.getName());
	    System.out.println(e2.getSalary());
	    System.out.println(e2.getDateofJoining());
	    
	    
	    /*System.out.println("----Checking after making salary static----");
	    System.out.println(e1.getSalary());
	    System.out.println(e2.getSalary());
	    */
	    
	    System.out.println(Employee.COMPANY_NAME);
	    
	}

}

