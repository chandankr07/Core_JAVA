

abstract class shape{
	
	abstract void draw();
}

class circle extends shape {
	void draw(){
		System.out.println("Drawing circle...");
	}
}

class rectangle extends shape {
	void draw(){
		System.out.println("Drawing rectangle....");
	}
}


public class AbstractClassExample {
	
public static void main(String[] args) {
			shape s = new circle();
	   
		shape s2= new rectangle();
	   
	   s.draw();
	   s2.draw();
	}  
}
