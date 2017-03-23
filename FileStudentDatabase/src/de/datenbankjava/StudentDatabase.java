package de.datenbankjava;

public interface StudentDatabase {
	
	public String[] readAllStudents() throws StudentDatabaseException;
	
	public void addStudent(String name) throws StudentDatabaseException;

}
