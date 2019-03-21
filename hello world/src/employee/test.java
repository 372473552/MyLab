package employee;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Employee> comp=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
			
		};
				
		Set<Employee> emps=new TreeSet<>(comp);
		Mydate date1=new Mydate(1984,10,1);
		Employee emp1=new Employee("JackyChan",35,date1);
		emps.add(emp1);
		
		Mydate date2=new Mydate(1974,10,20);
		Employee emp2=new Employee("LeonLai",45,date2);
		emps.add(emp2);
		
		Mydate date3=new Mydate(1969,5,12);
		Employee emp3=new Employee("AndyLaw",50,date3);
		emps.add(emp3);
		
		Mydate date4=new Mydate(1980,7,11);
		Employee emp4=new Employee("ArronKwor",39,date4);
		emps.add(emp4);
		
		Mydate date5=new Mydate(1983,2,21);
		Employee emp5=new Employee("SammiChan",36,date5);
		emps.add(emp5);
		
		
		Iterator<Employee> it;
		it=emps.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("-----------------------------------------");
		for(Employee empls:emps) {
			System.out.println(empls);
		}
			
		
			}
		
	

}
