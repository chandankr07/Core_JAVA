 abstract class Vehicle{
   
	 Vehicle(int data){
	  
		 System.out.println("\nVehicle is created : " +data);
	  }  
	 
	 abstract void run();  
   
	 void changeGear(){
		 System.out.println("gear changed");
	 	}  
 }  
  
	 class Honda extends Vehicle{  
		 Honda(int data) {
		 super(data);
			// TODO Auto-generated constructor stub
		}
	
	void run(){
		 System.out.println("running safely..");
		}  
	 }  
	 
		 class AbstractClass{  
		 public static void main(String args[]){  
		  Vehicle obj = new Honda(15);  
		  obj.run();  
		  obj.changeGear();  
		 }  
}  