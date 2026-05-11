
import java.io.*;

public class Main {

	public static void main(String args[]) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/students.txt"));
			StudentArray obj = new StudentArray();

			String line = "";
			while ((line = reader.readLine()) != null) {
				String rawid = line.substring(0, line.indexOf(","));
				int id = Integer.parseInt(rawid);

				line = line.substring(line.indexOf(",") + 1, line.length());

				String name = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",") + 1, line.length());

				double gpa = Double.parseDouble(line);
				Student a = new Student(name, id, gpa);
				obj.addStudent(a);

			}

			obj.displayStudents();
			obj.searchStudent("Maria Lopez");
			obj.deleteStudent("David Johnson");
			obj.displayStudents();
			
			// IO on exam paper does not show this being used, so it is commented out, but works for testing purposes.
			// obj.updateStudentGPA("Maria Lopez", 4.0);
			// obj.displayStudents();
			
			obj.findHighestGPA();
			obj.calculateAverageGPA();
			
			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("There was no file found with the name \n\"src/students.txt\", please correct this.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
