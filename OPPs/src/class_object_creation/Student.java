package class_object_creation;

import java.util.Scanner;

public class Student {
	
	int sid;
	String sname;
	int standard;
	
	void display(){
		/*System.out.println(sname+" "+sid +" "+standard);
		System.out.println(sid+" "+sname+" "+standard);*/
		
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name==sname) {
        	System.out.println(sname+" "+sid +" "+standard);
        }
	}

}
