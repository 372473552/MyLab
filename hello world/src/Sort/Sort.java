package Sort;
import java.lang.*;
import java.util.Scanner;
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
		System.out.println("please type funtion(b=BubbleSort;s=SelectSort):");
		String cmd=input.next();
		switch(cmd) {
		case "b":
			arrA=sort.bubbleSort(arrA);
			System.out.print("after BubbleSort digitals is:\n");
			break;
		case "s":
			arrA=sort.selectSort(arrA);
			System.out.print("after SelectSort digitals is:\n");
			break;
		default:
			break;
		}
		

		for(int i=0;i<arrA.length;i++) {
			System.out.print("Num "+(i+1)+" is:"+arrA[i]+"\t");
		}
		
	}

}
