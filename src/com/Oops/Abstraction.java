package com.Oops;
abstract class AbstractExample{
           abstract void shape();
           
          static void printShape() {
        	   System.out.println("shape");
           }
}
 class SubClas extends AbstractExample{

	@Override
	void shape() {
		System.out.println("shape method in SubClass");
		
	}
	 
 }
public class Abstraction {

	public static void main(String[] args) {
		
		SubClas abs= new SubClas();
		abs.shape();
		AbstractExample.printShape();
	}

}
