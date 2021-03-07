public class mainMethod {

	public static void main(String[] args) {
//		Venues test1 = new Venues("Rockafella", "Los Angeles", 2015, 10000.0);
//		Concerts concert1 = new Concerts("Halsey", 1000.0, 8, 2015);
//		Concerts concert2 = new Concerts("Khalid", 1000.0, 7, 2015);
//		
//		test1.addConcert(concert1);
//		test1.addConcert(concert2);
//		//System.out.println(test1.avgAttendance());
//		test1.capacityWarning();
//		//double number = 85.0/100.0;
//		//boolean test = (1.0 >= number);
//		//System.out.println(test);
		
		Company comp1 = new Company();
		Venues test2 = new Venues("Place 2", "Chicago", 2014, 20000.0);
		Venues test1 = new Venues("Rockafella", "Los Angeles", 2015, 10000.0);
		
		Concerts concert1 = new Concerts("Halsey", 1000.0, 8, 2016);
		Concerts concert2 = new Concerts("Khalid", 9000.0, 7, 2016);
		Concerts concert3 = new Concerts("Timberlake", 19000.0, 8, 2015);
		Concerts concert4 = new Concerts("Kelly Clarkson", 19000.0, 7, 2015);
		
		test1.addConcert(concert1);
		test1.addConcert(concert2);
		
		test2.addConcert(concert3);
		test2.addConcert(concert4);
		
		comp1.addVenue(test1);
		comp1.addVenue(test2);
		
		//comp1.maxAvgVenue();
		//comp1.maxConcertAttendance();
		//comp1.concertWarningList();
		comp1.leastWarningVenue();
		//System.out.println(test1.avgAttendance());
		//test1.capacityWarning();
	}

}
