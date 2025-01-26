package Oops_Class_Var_And_Methods;

public class Honda extends Vehicle{

	public Honda(String chasis, int number) {
		super(chasis, number);
		System.out.println("Child Class Constructor");
	}
   
	 public void m1() {
		 
		 System.out.println("Honda Class Method Calling");
	 }
	

}
