package com.lgs.lab.interface2;



public class MyCalculator implements com.lgs.lab.interface1.Numerable {
	
	double a;
	double b;
	

	public MyCalculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
		
	}

	@Override
	public void plus() {
		double c = this.a + this.b;
		System.out.println("a + b = " + c );
		
		

	}

	@Override
	public void minus() {
		double c = this.a - this.b;
		System.out.println("a - b = " + c );
		

	}

	@Override
	public void multiply() {
		double c = this.a * this.b;
		System.out.println("a * b = " + c );
		

	}

	@Override
	public void devide() {
		double c = this.a / this.b;
		System.out.println("a / b = " + c );
		

	}

}
