package com.assignment.week1;

public class MethodOverLoad {
  public void method(Object object) {
	  System.out.println("object");
  }
  public void method(String object) {
	  System.out.println("String");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoad s=new MethodOverLoad();
		s.method(s);
	}

}
