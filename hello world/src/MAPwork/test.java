package MAPwork;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,WorldChamp> worldChampMap=new HashMap<String,WorldChamp>();
		worldChampMap.put("1930", new WorldChamp("1st",new Date(1930),"������","������"));
		worldChampMap.put("1934", new WorldChamp("2nd",new Date(1934),"�����","�����"));
		worldChampMap.put("1938", new WorldChamp("3th",new Date(1938),"����","�����"));
		worldChampMap.put("1942", new WorldChamp("4th",new Date(1942),"����","������"));
		worldChampMap.put("1946", new WorldChamp("5th",new Date(1946),"��ʿ","����"));
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(worldChampMap.containsKey(input)) {
			System.out.println("����ھ��ǣ�"+worldChampMap.get(input).getChampion());
		}else {
			System.out.println("û���ҵ�");
		}
		
	}

}
