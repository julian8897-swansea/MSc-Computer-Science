import java.util.ArrayList;

public class Company {
	private ArrayList<Venues> venueList;
	
	public Company() {
		
		this.venueList = new ArrayList<>();
	}
	
	public void addVenue(Venues venue) {
        venueList.add(venue);
   }

	public void maxAvgVenue() {
		int max = venueList.get(0).avgAttendance();
		
		for (int i = 0; i < venueList.size(); i++) {
			if (venueList.get(i).avgAttendance() > max) {
				max = venueList.get(i).avgAttendance();
				System.out.println(venueList.get(i));
			}	
		}
	}
	
	public void maxConcertAttendance() {
		double max = venueList.get(0).maxAttendance();
		
		for (int i = 0; i < venueList.size(); i++) {
			if (venueList.get(i).maxAttendance() > max) {
				max = venueList.get(i).maxAttendance();
				System.out.println("Largest Attendance Recorded :" + max);
			}	
		}
	}
	
	public void concertWarningList() {	
		for (int i = 0; i < venueList.size(); i++) {
			venueList.get(i).capacityWarning();
			
		}
		
	}
	
	public void leastWarningVenue() {	
		int min = venueList.get(0).capacityWarning();
		
		for (int i = 0; i < venueList.size(); i++) {
			if (venueList.get(i).capacityWarning() < min) {
				min = venueList.get(i).capacityWarning();
				//System.out.println(min);
			}				
		}
		
	}
}
	
	
	
