   class Sample1 implements Runnable
{	
	public void run(){
		
		System.out.println("Task 1");
	}
}

class Sample2 implements Runnable
{	
	public void run(){
		
		System.out.println("Task 2");
	}

}

class MT {
		
	public static void main(String[] args) {
		
		Sample1 m1 = new Sample1();
		
		Sample2 m2 = new Sample2();
		
		Thread t1 = new Thread(m1);
		
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
	
	}
}
