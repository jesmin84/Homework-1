package package1;

public class ReturnTypeMethodWithParameter {

	public static void main(String[] args) {

		ReturnTypeMethodWithParameter.doCalculation(5000.00, 6000.55);

		ReturnTypeMethodWithParameter.getSum(500, 600);

		ReturnTypeMethodWithParameter.getSummary(5, 5);

		ReturnTypeMethodWithParameter.getTeacherInformation(10, 20);

		ReturnTypeMethodWithParameter.doInformation(500.50, 600.30);
	}

	public static double doCalculation(double salary1, double salary2) {

		double salary = salary1 + salary2;

		System.out.println("Total salary: " + salary);

		return salary;
	}

	public static int getSum(int cost1, int cost2) {
		int cost3 = cost1 + cost2;
		System.out.println("Total cost: " + cost3);

		return cost3;
	}

	public static int getSummary(int grade1, int grade2) {
		int grade3 = grade1 + grade2;
		System.out.println("Total grade: " + grade3);

		return grade3;
	}

	public static int getTeacherInformation(int subject1, int subject2) {
		int subject3 = subject1 + subject2;
		System.out.println("Total subject: " + subject3);

		return subject3;
	}

	public static double doInformation(double price1, double price2) {

		double price3 = price1 + price2;

		System.out.println("Total price: " + price3);

		return price3;
	}

}
