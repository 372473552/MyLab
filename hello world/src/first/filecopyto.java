package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filecopyto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("d:\\abc.txt");
		if(file.exists()) {
			System.out.println("�ļ��Ѵ���");
		}else {
			file.createNewFile();
			
		}
		System.out.println("������");
		FileOutputStream fos;
	
			fos = new FileOutputStream(file,true);
			String str="hello this is a helloworld test!����һ������";
			byte[] b=str.getBytes();
			fos.write(b);
	
			if(fos!=null) {
				fos.close();
			}
			
			
		}
		
	}


