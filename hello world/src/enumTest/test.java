package enumTest;

import org.junit.Test;

public class test {
@Test
public void test() {
	Season.SPRING.show();
	System.out.println(Season.SPRING.ToString());
	System.out.println("------------------------------------");
	for(Season ss:Season.values()) {
		System.out.println(ss.ToString());
	}
	System.out.println("------------------------------------");
	
	Season two=Season.valueOf("WINTER");
	System.out.println(two.ToString());
	
}

}
