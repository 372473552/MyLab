package IoWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		/*String answer="";
		Scanner sc=new Scanner(System.in);
		do {
			int num;String name;String sex;
			System.out.println("请输入学号");
			num=sc.nextInt();
			System.out.println("请输入姓名");
			name=sc.next();
			System.out.println("请输入性别");
			sex=sc.next();
			Student stu=new Student(num,name,sex);
			students.add(stu);
			
			System.out.println("请问是否还输入下一个y/n？");
			answer=sc.next();
		}while(answer.equals("y"));
		
		*/
		students=read();
		if(students.size()>0) {
			for(Student stu:students) {
				stu.show();
			}
		}else {
			System.out.println("student为空");
		}
			
	
		
	//	write(students);
		
		
		
	}
	public static List<Student> read(){
		File file=new File("iotest.data");
		List<Student> stus=null;
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			 stus=(List<Student> )ois.readObject();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return stus;
	}
	
	
	public static void write(List<Student> students) {
		File file=new File("iotest.data");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			if(students.size()>0) {
				oos.writeObject(students);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
