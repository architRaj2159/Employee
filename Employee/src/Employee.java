import java.time.LocalDate;

//static variables are commonly referred to as class variables
// non static variables are commonly referred to as instance variables
public class Employee{
  private final int psno;
  private String name;
  //private static double salary;
  private double salary;
  private LocalDate dateofJoining;
  
  /* This can be better example of static where we went only one copy of this variable
   * private static double totalRevenue = 100000000;*/
  
  
  //static + final gives us equivalent of CONSTANT in other Languages
  public static final String COMPANY_NAME = "LTI";
  
  // Constructor(s) -- called whenever the object is created for this class
  public Employee(int psno, String name, double salary, LocalDate dateofJoining){
    super();
    this.psno = psno;
    this.name = name;
    this.salary = salary;
    this.dateofJoining = dateofJoining;
  }
  
  //default constructor doesn't make any sense if we have final variables which needs to be initialized dynamically
  public Employee(){
	  psno = -1;
  }
  
  public Employee(int psno) {
	  this.psno = psno;
  }

  
  // Getters and setters
public int getPsno() {
	return psno;
}

/*public void setPsno(int psno) {
	this.psno = psno;
}*/

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public LocalDate getDateofJoining() {
	return dateofJoining;
}

public void setDateofJoining(LocalDate dateofJoining) {
	this.dateofJoining = dateofJoining;
}
  
}