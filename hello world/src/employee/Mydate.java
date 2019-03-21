package employee;

public class Mydate implements Comparable<Mydate>{
	private Integer year;
	private Integer month;
	private Integer date;
	
	public Mydate(Integer year, Integer month, Integer date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mydate [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	@Override
	public int compareTo(Mydate o) {
		// TODO Auto-generated method stub
		int res=this.year.compareTo(o.year);
		if(res==0) {
			int m=this.month.compareTo(o.month);
			if(m==0) {
				return this.date.compareTo(o.date);
			}else {
				return m;
			}
		}else {
			return res;
		}
		
	}
	
}
