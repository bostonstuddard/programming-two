
public class Student {
	
	private int id;
	private String name;
	private double gpa;
	
	public Student() {
		
		System.out.println("The default constructor is running.");
		
	}
	
	public Student(String name, int id, double gpa) {
		
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		
	}
	
	
	
	public String toString() {
		return this.name;
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



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}
