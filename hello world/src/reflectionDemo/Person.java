package reflectionDemo;

public class Person {
	public String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(int age) {
		super();
		this.age = age;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public  void show() {
		System.out.println("Method of show:"+"[name=" + name + ", age=" + age + "]");
	}
	
	public void display(String nation) {
		System.out.println("My address is   "+nation);
	}
	
}
