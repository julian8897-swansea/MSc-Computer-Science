import java.util.ArrayList;
import java.util.*;

public class Venues {
	private String name;
	private String location;
	private int openingYear;
	private double capacity;
	private ArrayList<Concerts> concertList;
	
	public Venues(String name, String location, 
			int openingYear, double capacity) {
		
		this.name = name;
		this.location = location;
		this.openingYear = openingYear;
		this.capacity = capacity;
		this.concertList = new ArrayList<>();
	}
	
	public void addConcert(Concerts concert) {
        concertList.add(concert);
   }
	
	public double maxAttendance() {
		final ArrayList<Double> attendanceList = new ArrayList<>();
		for(Concerts attendance : concertList) {
			attendanceList.add(attendance.getAttendance());			
		}
		
		double max = Collections.max(attendanceList);
		return max;
	}
	
	public int avgAttendance() {
		int total = 0;
		for(Concerts attendance : concertList) {
			total += attendance.getAttendance();		
		}
		int avg = total/concertList.size();
		return avg;
	}
	
	public int avgConcertPerYear() {
		final ArrayList<Integer> yearList = new ArrayList<>();
		for(Concerts year : concertList) {
			yearList.add(year.getYear());			
		}
		
		int maxYear = Collections.max(yearList);
		if (openingYear == maxYear) {
			System.out.println("Unable to calculate average");
			return 0;
			
		} else {
			int avg = concertList.size()/(maxYear - openingYear);
			return avg;
		}
		
	}
	
	public int capacityWarning() {
		final ArrayList<Concerts> warningList = new ArrayList<>();
		//double capacityDouble = (double)(capacity);
		final double TOLERANCE = 1e-14;
		double warningLevel = capacity*(85.0/100.0);
		//System.out.println(warningLevel);
		
		for (int i = 0; i < concertList.size(); i++) {
			//System.out.println(concertList.get(i).getAttendance() - warningLevel);
			
			if( concertList.get(i).getAttendance() - warningLevel >= TOLERANCE) {
				warningList.add(concertList.get(i));
				System.out.println(concertList.get(i));
								
			} 
		}		
		int warningCount = warningList.size();
		return warningCount;
	}
	
	public double getCapacity() {        
		return capacity;    
	}
	
	public String toString() {
		return ("Name :" + name + "\nLocation :" 
				+ location + "\nOpening Year :" 
				+ openingYear + "\nCapacity :" + capacity);

	}

}
