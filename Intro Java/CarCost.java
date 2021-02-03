/* Program to compute the cost of owning and running 2 cars
 */
class CarCost {
     public static void main(String[] args) {
		
		//arbitrary distance in km 
		double totalDist = 1.0e5;
		
		double carCost1 = 12000.0;
		double carCost2 = 18000.0;
		
		double serviceCost1 = 100.0;
		double serviceCost2 = 200.0;
		
		double kmPerLitre1 = 20.0;
		double kmPerLitre2 = 35.0;
		
		double fuelCostPerLitre1 = 1.1;
		double fuelCostPerLitre2 = 1.4;
		
		//service interval in terms of km
		double serviceInterval1 = 15000.0;
		double serviceInterval2 = 25000.0;
		
		//fuel cost formula for an arbitrary distance
		double fuelCost1 = (fuelCostPerLitre1/kmPerLitre1)*totalDist;
		double fuelCost2 = (fuelCostPerLitre2/kmPerLitre2)*totalDist;
		
		//total service cost formula for an arbitrary distance
		double serviceCostFinal1 = (serviceCost1/serviceInterval1)*totalDist;
		double serviceCostFinal2 = (serviceCost2/serviceInterval2)*totalDist;
        
		double totalCost1 = carCost1 + fuelCost1 + serviceCostFinal1;
		double totalCost2 = carCost2 + fuelCost2 + serviceCostFinal2;
		
		System.out.println("Distance in km: " + totalDist);
		System.out.println("Cost to Own and Run Car1: " + totalCost1);
		System.out.println("Cost to Own and Run Car2: " + totalCost2);
		System.out.println("Cost to Own and Run both cars: " + 
			(totalCost1 + totalCost2));
		
     }
}