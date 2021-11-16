package generics;
import java.util.HashSet;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	Employee(int id,String name,double salary,String department)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	/*public int hashCode() {
		return this.getId();
		}
	public boolean equals(Object obj) {
		Employee e=null;
		if(obj instanceof Employee) {
			e=(Employee)obj;
		}
		if(this.getId()==e.getId()) {
			return true;
		}
		else {
			return false;
		}
	}*/
	public  void displaydetails()
	{
		System.out.println("employee id: "+getId()); 
		System.out.println("employee name: "+getName()); 
		System.out.println("employee salary: "+getSalary()); 
		System.out.println("employee department: "+getDepartment()); 
		
	}
}

