package ObjectClass;

public class practice1 {

	public static class Person {
		 int age;
		 String name;

//		public Person(int age, String name) {
//			this.age = age;
//			this.name = name;
//		}
		 
		 public Person() { 
		 }

		public void saysHi() {
			System.out.println(this.age + " " + this.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();		
		p1.age=10;
		p1.name="A";
		
		Person p2=new Person();
		p2.age=20;
		p2.name="B";
		
		p1.saysHi();
		p2.saysHi();
		swap(p1,p2);
		swap2(p1,p2);
		p1.saysHi();
		p2.saysHi();

	}
public static void swap(Person p1,Person p2) {
	Person temp=p1;
	p1=p2;
	p2=temp;
}
public static void swap2(Person p1,Person p2) {
	int tage=p1.age;
	p1.age=p2.age;
	p2.age=tage;
	
	String tname=p1.name;
	p1.name=p2.name;
	
}
}
