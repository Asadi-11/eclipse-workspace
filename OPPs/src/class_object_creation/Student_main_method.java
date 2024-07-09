package class_object_creation;

public class Student_main_method {

	public static void main(String[] args) {
		
		//creating obj
		Student stu= new Student();
		
		stu.sid=949;
		stu.sname="Parvi";
		stu.standard=6;
		
		stu.display();
		
		Student stu1= new Student();
		
		stu1.sid= 950;
		stu1.sname= "James";
		stu1.standard=7;
		stu1.display();
//		new Student().display();

	}

}
