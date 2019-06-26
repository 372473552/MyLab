package IoWork;

import java.io.Serializable;

public class Student implements Serializable{
	private int number;
	private String name;
	private String sex;
	
	public Student(int number, String name, String sex) {
		
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	public Student() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public void show() {
		System.out.println( "Student [number=" + number + ", name=" + name + ", sex=" + sex + "]");
	}
	

}
