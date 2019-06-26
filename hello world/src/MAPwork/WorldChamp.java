package MAPwork;

import java.util.Date;

public class WorldChamp {
	public WorldChamp() {
		super();
	}
	public WorldChamp(String term, Date year, String location, String champion) {
		this.term = term;
		this.year = year;
		this.location = location;
		Champion = champion;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getChampion() {
		return Champion;
	}
	public void setChampion(String champion) {
		Champion = champion;
	}
	private String term;
	private Date year;
	private String location;
	private String Champion;
	
}
