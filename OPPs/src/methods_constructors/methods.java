package methods_constructors;

public class methods {

	int a=20;
	int b= 30;
//	method m1 declare with no parameters and no return value
	void m1() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(2000);
		System.out.println("How are you doing?");
	}
	
	//method with no parameters return value
	int m2() {
		return a+b;
	}
	
	//takes parameters no return
	void m3(int c) {
		System.out.println(a+b+c);
	}
	
	//Takes parameters return value
	int m4(int c) {
		return (a+b+c);
	}

}
