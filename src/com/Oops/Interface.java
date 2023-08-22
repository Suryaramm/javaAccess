package com.Oops;

public interface Interface {
       void Shape();
       void printShape();
}
class SubClass implements Interface{

	@Override
	public void Shape() {
		System.out.println("this is shape method from subperClass");
		
	}

	@Override
	public void printShape() {
	    System.out.println("this is the printShape method from   superclass");
		
	}
	
}

 class Main{
	 public static void main(String[] args) {
		 SubClass interf=new SubClass(); 
			
		 interf.Shape();
		 interf.printShape();
	 }
 }