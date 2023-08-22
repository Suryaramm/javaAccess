package pk1;

public class Student {
	
	public String name;
	 public int rollNo;
	 
	 public Student(int rollNo,String name) {
		 this.rollNo=rollNo;
		 this.name=name;
	 }
	 
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public  void printName() {
	   System.out.println(rollNo);
   }
	public static void main(String[] args) {
		Student s=new Student(45,"surya");
		System.out.println(s.rollNo);
		System.out.println(s.name);
	}

}
