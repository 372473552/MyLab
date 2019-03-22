package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class testJunit {
@Test
public void test(){
	User user1=new User(1,28,"JackyChan");
	User user2=new User(2,38,"LeonLai");
	User user3=new User(3,48,"AndyLaw");
	User user4=new User(4,58,"Arron Kwor");
	User user5=new User(5,18,"SammiChan");
	DAO<User> dao=new DAO<>();
	dao.save("u1", user1);
	dao.save("u2", user2);
	dao.save("u3", user3);
	dao.save("u4", user4);
	dao.save("u5", user5);
	
	User uu=dao.get("u3");
	System.out.println(uu);
	
	dao.update("u5", new User(6,24,"KellyChueng"));
	uu=dao.get("u5");
	
	System.out.println(uu);
	System.out.println("-------------------------------------");
	
	Iterator<User> it;
	it= dao.list().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("-------------------------------------");
	List<User> listuser=new ArrayList<>();
	listuser=dao.list();
	for(User ur:listuser) {
		System.out.println(ur);
	}
	
}
}
