package methods_constructors;

public class student {
	
	int sid;
	String name;
	int total_marks;
	String grade;
//	
//	student(int id, String sname, int marks, String g){
//		
//		sid= id;
//		name= sname;
//		total_marks= marks;
//		grade= g;
//	}
//	
	student(){
		sid= 45;
		name= "james";
		total_marks= 450;
		grade= "A+";
	}
	void Student_details() {
		
		System.out.println(sid+" "+name+" "+total_marks+" "+grade);
	}
	

}
