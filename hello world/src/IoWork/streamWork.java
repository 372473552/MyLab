package IoWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class streamWork {
	static int num=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String docTab=" ";
		String fileTab=" ";
		
		System.out.println("����ǣ�"+System.currentTimeMillis());
        String jversion=System.getProperty("java.version");
        String oName=System.getProperty("os.name");
        String user=System.getProperty("user.name");
        System.out.println("Java ����ʱ�����汾��"+jversion);
        System.out.println("��ǰ����ϵͳ�ǣ�"+oName);
        System.out.println("��ǰ�û��ǣ�"+user);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = "";
		System.out.println("������Ϸ���ַ��");
		try {
			str = br.readLine();
			File file = new File(str);
				read(file.getAbsoluteFile(),docTab,fileTab);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void read(File dir,String docT,String fileT) {
		docT=docT.concat(" ");
		fileT=fileT.concat("  ");
		
		/*
		 * ���dir��Ŀ¼
		 */
		if(!dir.isFile()) {
			
			System.out.println(docT+"�ļ���-"+dir.getName());
			File[] files=dir.listFiles();
			
			for(File file:files) {
				read(file.getAbsoluteFile(),docT,fileT);
			}
				
		
		}else {
			
			System.out.println(fileT+dir.getName());
			
		}
	}
}
