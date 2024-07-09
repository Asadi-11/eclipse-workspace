package class_object_creation;

public class Employee {

	int eid;
	String ename;
	String job;
	int sal;
	
	//creating void method
	void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	public static void main(String[] args) {
		
		//Creating obj for class employee
		Employee emp= new Employee();
		
		emp.eid= 949;
		emp.ename= "Parvi";
		emp.job= "SEDT";
		emp.sal= 100000;
		
		emp.display();

	}

}
