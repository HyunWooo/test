package test.nine;

import java.util.ArrayList;
import java.util.List;

import test.eight.Student;

public class test2{

	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student();
		st.setName("장");
		st.setNo(1);
		
		Student st2 = new Student();
		st2.setName("김");
		st2.setNo(2);
		
		Student st3 = new Student();
		st3.setName("이");
		st3.setNo(3);
		
		List<Student> students = new ArrayList<Student>();
		students.add(st);
		students.add(st2);
		students.add(st3);
		
		ClassRoom majorClass = new ClassRoom();
		majorClass.setStudents(students);
		majorClass.setClassName("첫번째클래스룸");
		
		System.out.println(majorClass.getStudents());
		
		ClassRoom majorClass2 = (ClassRoom) majorClass.clone();
		
		System.out.println(majorClass2.getClassName());
		System.out.println(majorClass2.getStudents());
		
		Student st4 = new Student();
		st4.setName("강");
		st4.setNo(4);
		majorClass2.getStudents().add(st4);
		
		System.out.println(majorClass.getStudents());
		System.out.println(majorClass2.getStudents());
	}
}
