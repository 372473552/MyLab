package MAPwork;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,WorldChamp> worldChampMap=new HashMap<String,WorldChamp>();
		worldChampMap.put("1930", new WorldChamp("1st",new Date(1930),"乌拉圭","乌拉圭"));
		worldChampMap.put("1934", new WorldChamp("2nd",new Date(1934),"意大利","意大利"));
		worldChampMap.put("1938", new WorldChamp("3th",new Date(1938),"法国","意大利"));
		worldChampMap.put("1942", new WorldChamp("4th",new Date(1942),"巴西","乌拉圭"));
		worldChampMap.put("1946", new WorldChamp("5th",new Date(1946),"瑞士","西德"));
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(worldChampMap.containsKey(input)) {
			System.out.println("本届冠军是："+worldChampMap.get(input).getChampion());
		}else {
			System.out.println("没有找到");
		}
		
	}

}
