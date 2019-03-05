package Sort;
import java.lang.Integer;

import Sort.Num;
public class SortMachine {
	/**
	 * @author raymondhe
	 * ≈≈–Ú∑Ω∑®£∫√∞≈›°¢—°‘Ò≈≈–Ú°£ 
	 * 
	 * 
	 */
	public SortMachine() {
		// TODO Auto-generated constructor stub
	
	}
	public void bubbleSort(Num[] arr) {
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
		
	}
	public void bubbleSort(Num[] arr,String orderBy) {
		if(orderBy=="desc") {
			for(int i=0;i< arr.length ;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].getN() < arr[j].getN()) {
						int tmp;
						tmp=arr[i].getN();
						arr[i].setN(arr[j].getN());
						arr[j].setN(tmp);
					}
				}
				
			}
		}else {
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
		}
	}

	public void selectSort(Num[] arr) {
		int index=0, tmp=0;
		for(int j=0;j<arr.length;j++) {
			index=j;
			for(int i=j;i<arr.length;i++) {
				if(arr[index].getN() >= arr[i].getN()) {
					index=i;
				}
			}
			tmp=arr[j].getN();
			arr[j].setN(arr[index].getN());
			arr[index].setN(tmp);
			
		}
	
	}
	public void selectSort(Num[] arr,String orderBy) {
		if(orderBy=="desc") {
			int index=0, tmp=0;
			for(int j=0;j<arr.length;j++) {
				index=j;
				for(int i=j;i<arr.length;i++) {
					if(arr[index].getN() >= arr[i].getN()) {
						index=i;
					}
				}
				tmp=arr[j].getN();
				arr[j].setN(arr[index].getN());
				arr[index].setN(tmp);
				
			}
		}else {
				int index=0, tmp=0;
				for(int j=0;j<arr.length;j++) {
					index=j;
					for(int i=j;i<arr.length;i++) {
						if(arr[index].getN() <= arr[i].getN()) {
							index=i;
						}
					}
					tmp=arr[j].getN();
					arr[j].setN(arr[index].getN());
					arr[index].setN(tmp);
					
				}
			}
		
	}
}
