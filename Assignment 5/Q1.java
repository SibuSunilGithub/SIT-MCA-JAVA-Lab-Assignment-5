/*
Define a class Person with properties name and dob (String) and a member function
personDetails() to display the details of a person. Create a subclass Employee with an
additional property companyName and employeeId and a method employeeDetails()
to display employee details. Create objects of both Person and Employee class and
display their details.
*/

class Person{
	protected String name;
	protected String dob;
	
	public Person(String name, String dob){
		this.name = name;
		this.dob = dob;
	}
	
	public void personDetails(){
		System.out.println("Person Details");
		System.out.println("Name: "+name);
		System.out.println("DOB: "+dob);
	}
}

class Employee extends Person{
	private String companyName;
	private int employeeId;
	
	public Employee(String name, String dob, String companyName, int employeeId){
		super(name, dob);
		this.companyName = companyName;
		this.employeeId = employeeId;
	}
	
	public void employeeDetails(){
		System.out.println("Employee Details");
		System.out.println("Name: "+name);
		System.out.println("DOB: "+dob);
		System.out.println("Company Name: "+ companyName);
		System.out.println("Id: "+employeeId);
	}
}

class PersonEmployee{
	public static void main(String [] args){
		
		Person person = new Person("Sunil", "14/01/2002");
		Employee employee = new Employee("Suman", "12/03/2003", "TCS", 16);
		
		person.personDetails();
		employee.employeeDetails();
	}
}