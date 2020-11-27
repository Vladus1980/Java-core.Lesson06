package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Plus;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator(100, 10);
				m.plus();
				m.minus();
				m.multiply();
				m.devide();
				
		MyCalculator m1 = new MyCalculator(15.6, 3.2);
				m1.plus();
				m1.minus();
				m1.multiply();
				m1.devide();


	}

}
