package com.Oops;
class Surya {
	void  print() {
		
	System.out.println("surya");
}
}
class Jaan extends Surya {
	void  print() {
		System.out.println("jaan");
	}
}
public class A1 {

	public static void main(String[] args) {
		 Surya s=new Jaan();
		 s.print();
           System.out.println("hfhgh");
	}

}
