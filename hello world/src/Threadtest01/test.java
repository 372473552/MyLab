package Threadtest01;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chopsticks cs=new Chopsticks();
		Person A=new Person("A", cs);
		Person B=new Person("B", cs);
		Person C=new Person("C", cs);
		Person D=new Person("D", cs);
		Person E=new Person("E", cs);
		Thread thA=new Thread(A, "A");
		Thread thB=new Thread(B, "B");
		Thread thC=new Thread(C, "C");
		Thread thD=new Thread(D, "D");
		Thread thE=new Thread(E, "E");
		
		thA.start();
		thB.start();
		thC.start();
		thD.start();
		thE.start();
	}

}
