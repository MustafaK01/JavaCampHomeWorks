package Homework_2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		//Student student=new Student[3];
		Student student1=new Student();
		Student student2=new Student();
		student1.setFirstName("Ceyda");
		student2.setFirstName("Veli");
		Instructor �nstructor = new Instructor();
		Instructor �nstructor2 = new Instructor();
		�nstructor.setFirstName("Mehmet");
		�nstructor2.setFirstName("Ali");
		userManager userManager=new userManager();
		studentManager studentManager=new studentManager();
		InstructorManager �nstructorManager=new InstructorManager();
		Student[] students= {student1,student2};
		Instructor[] instructors= {�nstructor,�nstructor2};
		/*
		userManager.add(student1);
		userManager.add(�nstructor);
		userManager.add(student2);
		userManager.add(�nstructor2);
		*/
		userManager.addMultiple(instructors);
		userManager.addMultiple(students);
		�nstructorManager.seeAllInstructors(instructors);
		studentManager.seeAllStudents(students);

	}
}
