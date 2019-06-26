package reflectionDemo;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		Person person=new Person();
		person.setAge(22);
		person.setName("Raymond");
		person.show();
		person.display("GZ");
	}
	@Test
	public void test2() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class clazz=Person.class;
		Person person=(Person)clazz.newInstance();
		person.setAge(18);
		person.setName("Money");
		Method setNameMethod=clazz.getMethod("setName",String.class);
		setNameMethod.invoke(person, "abc");
		Method displayMothod=clazz.getMethod("display", String.class);
		Method ShowMothod=clazz.getMethod("show");
		ShowMothod.invoke(person, null);
		displayMothod.invoke(person, "GuangZhou");
		
	}
}
