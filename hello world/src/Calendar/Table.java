package Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Table {
	public enum week{Mon,Tue,Wed,Thur,Fri,Sat,Sun;}
	public static void main(String[] args) {
		 List<ArrayList> tt=new ArrayList<>();
		SimpleDateFormat sdf;
		Date prevD,nextD;
		 List row1=new ArrayList();
		 for(int i=0;i<week.values().length;i++) {
			 row1.add(week.values()[i]);
		 }
		 
//			String strDate=br.readLine();
		//			sdf=new SimpleDateFormat("yyMMdd");
		//			prevD=new Date(2019,sdf.parse(strDate).getMonth(),1);
		//			nextD=new Date(2019,sdf.parse(strDate).getMonth()+1,1);
		//			Calendar ca1=Calendar.getInstance();
					Calendar ca2=Calendar.getInstance();
					ca2.setTime(new Date());
					
					System.out.println(ca2.DAY_OF_MONTH);
		 
		
	}
	
	
	
	
	
	
	

	
	
}
