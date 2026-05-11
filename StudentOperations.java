
public interface StudentOperations {

	void addStudent(Student student);
	Student searchStudent(String name);
	void deleteStudent(String name);
	void updateStudentGPA(String name, double newGPA);
	double calculateAverageGPA();
	Student findHighestGPA();
	void displayStudents();
	
}
