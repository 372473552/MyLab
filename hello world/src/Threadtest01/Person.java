package Threadtest01;

import java.util.Random;

public class Person implements Runnable {
	private String name;
	private Chopsticks chopsticks;
	public Person(String name, Chopsticks chopsticks) {
	
		this.name = name;
		this.chopsticks = chopsticks;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (chopsticks) {
				if(!chopsticks.isBusy()) {
					System.out.println(name+"开始吃饭！");
					chopsticks.setBusy(true);
					try {
						Thread.sleep(new Random().nextInt(200));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name+"吃完了！");
					chopsticks.setBusy(false);
				}
			}
			
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
