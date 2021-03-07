
public class Concerts {
	private String artist;
	private double attendance;
	private int month;
	private int year;
	
	//Constructor
	public Concerts(String artist, double attendance, 
			int month, int year) {
		
		this.artist = artist;
		this.attendance = attendance;
		this.month = month;
		this.year = year;
	}
	
	public String getArtist() {        
		return artist;    
	}
	
	public double getAttendance() {        
		return attendance;    
	}
	
	public int getMonth() {        
		return month;    	
	}
	
	public int getYear() {        
		return year;    	
	}
	
	public String toString() {
		return ("Artist :" + artist + "\nAttendance :" 
				+ attendance + "\nMonth :" 
				+ month + "\nYear :" + year);

	}
}
