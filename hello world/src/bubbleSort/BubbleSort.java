package bubbleSort;
import bubbleSort.*;
import java.lang.*;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please input 10 digitals:");
		
		 Num[] arrA =new Num[10];
		
		for(int i=0;i<arrA.length;i++) {
			Num tmp=new Num(input.nextInt());
			arrA[i]=tmp;	
		}
		
		System.out.print("organzise digitals is:");
		for(int i=0;i<arrA.length;i++) {
			System.out.print(arrA[i].toString()+"\t");
		}
		System.out.println();
	
		SortMachine sort=new SortMachine();
		arrA=sort.sort(arrA);
		System.out.print("after sort digitals is:");

		for(int i=0;i<arrA.length;i++) {
			System.out.print(arrA[i]+"\t");
		}
		
	}

}
