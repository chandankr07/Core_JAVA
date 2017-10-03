

abstract class Bike{  
  abstract void run();  
}  

class Honda4 extends Bike{  
	void run(){
		System.out.println("running safely..");
	}  

public static void main(String args[]){  
	 Bike obj = new Honda4();  
	 obj.run();  
	}  
}  



// Also like Bank, SBI, PNB you can show abstraction
// Shape, Circle, Rectangle you can show abstraction

//example of abstract class that have method body  
/*
 * 
 * 
 * 
 * abstract class Bike{  
 
	 Bike(){System.out.println("bike is created");}  
	 abstract void run();  
	 void changeGear(){System.out.println("gear changed");}  
}  

class Honda extends Bike{  
	void run(){System.out.println("running safely..");}  
}  
class TestAbstraction2{  
	public static void main(String args[]){  
		Bike obj = new Honda();  
		obj.run();  
		obj.changeGear();  
	}  
}  

* output : bike is created
       	   running safely..
       	   gear changed
*
*
*/