package Sort;

public class InsertSort extends SortMachine {
	public Num[] arr;
	public String orderby;
	public InsertSort(Num[] arr, String orderby) {
		
		this.arr = arr;
		this.orderby = orderby;
	}
	public InsertSort(Num[] arr) {
		
		this.arr = arr;
		
	}
	public void sort() {
		int j;
		for(int i=1;i<arr.length;i++) {
			int tmp=arr[i].getN();
			switch(orderby) {
			case "desc":
				for( j=i-1;j>=0 && tmp>arr[j].getN();j--) {
					arr[j+1].setN(arr[j].getN());	
					}
					arr[j+1].setN(tmp);
				
			case "asc":
				for( j=i-1;j>=0 && tmp<arr[j].getN();j--) {
					arr[j+1].setN(arr[j].getN());	
					}
					arr[j+1].setN(tmp);
				
			default:
				break;
			}
		}
			
			
			
		}
		
	
}
