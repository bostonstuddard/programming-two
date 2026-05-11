
public class StudentArray implements StudentOperations {
	
	private Student[] students;
	private int size;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		if(this.students != null) {
			Student[] tempArr = this.students;
			Student[] newArr = new Student[tempArr.length+1];
		
			for(int i = 0; i < this.students.length; i++) {
				newArr[i] = this.students[i];
			}
		
			newArr[this.students.length] = student;
			this.students = newArr;
			size++;
		}else {
			this.students = new Student[1];
			this.students[0] = student;
			size++;
		}
		
	}

	@Override
	public Student searchStudent(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Searching for " + name + "...");
		
		for(int i = 0; i < this.students.length; i++) {
			
			//System.out.println("DEBUG IGNORE: " + this.students[i].getName() + " vs " + name);
			
			if(this.students[i].getName().contentEquals(name)) {
				
				System.out.print("Student Found: ");
				System.out.print("ID: ");
				System.out.print(this.students[i].getId());
				System.out.print(" | ");
				System.out.print("Name: ");
				System.out.print(this.students[i].getName());
				System.out.print(" | ");
				System.out.print("GPA: ");
				System.out.print(this.students[i].getGpa());
				System.out.println("\n");
				return this.students[i];
			}
			
		}
		
		System.out.println("If the code has reached this\npoint, no student was found.\n");
		return null;
	}

	@Override
	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Deleting " + name + "...");
		
		Student a = null;
		
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i].getName().contentEquals(name)) {
				
				a = this.students[i];
				i = this.students.length;
				
			}
			
		}
		
		//Student a = searchStudent(name);
		Student[] arr = this.students;
		Student [] newArr = new Student[arr.length-1];
		
		for(int i = 0; i < newArr.length; i++) {
			
			
			//System.out.println(this.students[i]);
			if(this.students[i] != a) {
				newArr[i] = this.students[i];
			}
		}
		
		size--;
		this.students = newArr;
		System.out.println("Student successfully removed.\n");
		
	}

	@Override
	public void updateStudentGPA(String name, double newGPA) {
		// TODO Auto-generated method stub
		
		System.out.println("Updating GPA of " + name + "...");
		
		Student a = null;
		
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i].getName().contentEquals(name)) {
				
				this.students[i].setGpa(newGPA);
				i = this.students.length;
				
			}
			
		}
		
		System.out.println("Student GPA successfully updated.");
		
	}

	@Override
	public double calculateAverageGPA() {
		// TODO Auto-generated method stub
		
		double totalGPA = 0.0;
		
		for(int i = 0; i < this.students.length; i++) {
			
			totalGPA += this.students[i].getGpa();
			
		}
		
		totalGPA /= size;
		String displayGPA = "" + totalGPA;
		if(displayGPA.length() > 4) {
			displayGPA = displayGPA.substring(0, 4);
		}
		System.out.println("Average GPA: " + displayGPA);
		
		return totalGPA;
	}

	@Override
	public Student findHighestGPA() {
		// TODO Auto-generated method stub
		
		double highestGPA = -1.0;
		Student a = null;
		
		for(int i = 0; i < this.students.length; i++) {
			
			if(this.students[i].getGpa() > highestGPA) {
				
				highestGPA = this.students[i].getGpa();
				a = this.students[i];
				
			}
			
		}
		
		if(highestGPA != -1.0) {
			System.out.print("Highest GPA Student:\n");
			System.out.print("ID: ");
			System.out.print(a.getId());
			System.out.print(" | ");
			System.out.print("Name: ");
			System.out.print(a.getName());
			System.out.print(" | ");
			System.out.print("GPA: ");
			System.out.print(a.getGpa());
			System.out.println("\n");
			return a;
		}else {
			System.out.println("Some kind of error occured, as no top student was found.\n");
			return null;
		}
		
		
	}

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		System.out.println("All Students:");
		for(int i = 0; i < this.students.length; i++) {
			
			System.out.print("ID: ");
			System.out.print(this.students[i].getId());
			System.out.print(" | ");
			System.out.print("Name: ");
			System.out.print(this.students[i].getName());
			System.out.print(" | ");
			System.out.print("GPA: ");
			System.out.print(this.students[i].getGpa());
			System.out.println("");
		}
		System.out.println();
	}

}
