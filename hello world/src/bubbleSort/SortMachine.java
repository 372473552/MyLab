package bubbleSort;
import bubbleSort.Num;
import java.lang.Integer;
public class SortMachine {
	
	public SortMachine() {
		// TODO Auto-generated constructor stub
	
	}
	public Num[] sort(Num[] arr) {
		for(int i=0;i< arr.length ;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getN() > arr[j].getN()) {
					int tmp;
					tmp=arr[i].getN();
					arr[i].setN(arr[j].getN());
					arr[j].setN(tmp);
				}
			}
			
		}
		
		
		
		
		return arr;
	}

}
