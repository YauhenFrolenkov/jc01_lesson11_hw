package edu.training.jc.tasks.main;

import edu.training.jc.tasks.complex.Complex;

public class Main {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		
		Complex c3;
		
		c1.realPart = 1;
		c1.imaginaryPart = 2;
		
		c2.realPart = 4;
		c2.imaginaryPart = 5;
		
		c3 = add(c1, c2);
		
		System.out.println(c3.realPart + " + " + c3.imaginaryPart + "i");

	}
	
	public static Complex add(Complex com1, Complex com2) {
		int realP, imagP;
		
		realP = com1.realPart + com2.realPart;
		imagP = com1.imaginaryPart + com2.imaginaryPart;
		
		Complex c = new Complex();
		c.realPart = realP;
		c.imaginaryPart = imagP;
		
		return c;
	}

}
