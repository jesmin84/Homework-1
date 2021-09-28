package package1;

public class NonReturnTypeMethodWithParameter {

	public static void main(String[] args) {

		NonReturnTypeMethodWithParameter.getInformation("Shanto", 41);

		NonReturnTypeMethodWithParameter Munmun = new NonReturnTypeMethodWithParameter();
		Munmun.doMultiply(20, 30);

		Munmun.doAddition(30, 30);

		NonReturnTypeMethodWithParameter.getStudentInformation("Evan", 2);

		Munmun.doCalculation(40, 40);
	}

	public static void getInformation(String name, int age) {

		System.out.println("Student name: " + name);

		System.out.println("Student age: " + age);

	}

	public void doMultiply(int num3, int num4) {

		System.out.println("Multiply:" + num3 * num4);

	}

	public void doAddition(int num3, int num4) {
		int num5 = num3 + num4;
		System.out.println("Addition: " + num5);

	}

	public static void getStudentInformation(String name2, int grade) {

		System.out.println("Student name: " + name2);

		System.out.println("Student grade: " + grade);

	}

	public void doCalculation(int cost1, int cost2) {
		int cost5 = cost1 - cost2;
		System.out.println("Calculation :" + cost5);

	}

}
