package de.datenbankjava;

public class MainFileStudentDatabase {

	public static void main(String[] args) {
		StudentDatabase sd = new FileStudentDatabase();
		try {
			String[] students = sd.readAllStudents();
			for (String student : students) {
				System.out.println(student);
			}
		} catch (StudentDatabaseException e) {
			System.out.println("Es ist ein Fehler aufgetreten.");
		}
	}

}
