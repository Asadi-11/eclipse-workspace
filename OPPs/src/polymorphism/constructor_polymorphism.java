package polymorphism;

public class constructor_polymorphism {
	
	double width, height, depth;
	constructor_polymorphism(){
		width=0;
		height=0;
		depth=0;
//		System.out.println(width, height, depth);
	}
	constructor_polymorphism(double w, double h, double d){
		width= w;
		height= h;
		depth=d;
		
	}
	constructor_polymorphism(double len){
		width=height=depth= len;
	}
	
	double volume() {
		return width*height*depth;
	}

}
