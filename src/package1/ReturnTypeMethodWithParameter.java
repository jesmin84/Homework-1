package package1;

public class ReturnTypeMethodWithParameter {
	
	public static void main(String[] args) {

		 ReturnTypeMethodWithParameter.doCalculation(5000.00, 6000.55);
	
		 ReturnTypeMethodWithParameter.getSum(40, 50);
	
	
	}
	
	
	
	public static double doCalculation(double salary1,double salary2 ) {
		
		double salary = salary1 +salary2;
		
		System.out.println("Total salary: "+salary);
	
	
	return salary;
	}
	public static int getSum(int cost1, int cost2) {
	int cost3 = cost1+ cost2;	
	System.out.println("Total cost: "+cost3);	
		
	return cost3;	
	}
  




















}


