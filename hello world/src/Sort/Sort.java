package Sort;
import java.lang.*;
import java.util.regex.*;



import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import Sort.*;
public class Sort {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		Random r=new Random();
		 Num[] arrA =new Num[5];
		
		for(int i=0;i<arrA.length;i++) {
			Num tmp=new Num(r.nextInt(100));
			arrA[i]=tmp;	
		}
		
		System.out.print("organzise digitals is: \n");
		for(int i=0;i<arrA.length;i++) {
			System.out.print("Num "+(i+1)+" is:"+arrA[i]+"\t");
			if (i==arrA.length-1) {
				System.out.print("\n");
			}
		}
		SortMachine sort=new SortMachine();
		System.out.println("please type funtion(b=BubbleSort;s=SelectSort) and orderby(desc;asc):");
		String cmd=input.next();
		String[] cmds=cmd.split(",");
		switch(cmds[0]) {
		case "b":
			sort.bubbleSort(arrA,cmds[1]);
			System.out.print("after BubbleSort digitals is:\n");
			break;
		case "s":
			sort.selectSort(arrA,cmds[1]);
			System.out.print("after SelectSort digitals is:\n");
			break;
		case "i":
			InsertSort is=new InsertSort(arrA,cmds[1]);
			is.sort();
			System.out.print("after InsertSort digitals is:\n");
			break;
		case "l":
			ArrayList<Num> al=new ArrayList<>(Arrays.asList(arrA));
			al.sort(new Comparator<Num>() {

				@Override
				public int compare(Num n1,Num n2) {
					// TODO Auto-generated method stub
					
					return n1.compareTo(n2);
				}
				
			});
			
			arrA=al.toArray(arrA);
			
			System.out.print("after ListSort digitals is:\n");
		
			break;
		case "m":
			Map<Integer,Num> map=new HashMap<>();
			for(int i=0;i<arrA.length;i++) {
				map.put(i, arrA[i]);
			}
			Iterator<Map.Entry<Integer,Num>> it=map.entrySet().iterator();
			while(it.hasNext()) {
				System.out.print(" \t"+it.next());
			}
			
			System.out.print("after MapSort digitals is:\n");
			break;
		default:
			break;
		}
		

		for(int i=0;i<arrA.length;i++) {
			System.out.print("Num "+(i+1)+" is:"+arrA[i]+"\t");
		}
		input.close();
	}

}
