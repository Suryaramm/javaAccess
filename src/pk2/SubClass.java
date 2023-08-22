package pk2;

import pk1.Student;

public class SubClass extends Student {

	public SubClass(int rollNo, String name) {
		super(rollNo, name);
		// TODO Auto-generated constructor stub
	}
	 public void test() {
		 System.out.println(rollNo);
		 System.out.println(name);
	 }

	
	public static void main(String[] args) {
		SubClass s=new SubClass(85,"surya");
		s.test();

	}

}
