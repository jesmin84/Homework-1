package package1;

public class NonReturnTypeMethodWithoutParameter {

	public static void main(String[] args) {

		NonReturnTypeMethodWithoutParameter.doAddition();

		NonReturnTypeMethodWithoutParameter.doMultiplication();

		NonReturnTypeMethodWithoutParameter Jesmin = new NonReturnTypeMethodWithoutParameter();
		Jesmin.doSubtraction();

		Jesmin.doDivision();

		Jesmin.doCalculation();

	}

	public static void doAddition() {
		int num1 = 50;
		int num2 = 60;
		int num3 = num1 + num2;
		System.out.println(num3);

	}

	public void doSubtraction() {

		int num1 = 50;
		int num2 = 60;
		int num3 = num2 - num1;
		System.out.println(num3);
	}

	public void doDivision() {

		int num1 = 50;
		int num2 = 100;
		int num3 = num2 / num1;
		System.out.println(num3);
	}

	public static void doMultiplication() {
		int num1 = 40;
		int num2 = 60;
		int num3 = num1 * num2;
		System.out.println(num3);

	}

	public void doCalculation() {

		int num1 = 200;
		int num2 = 100;
		int num3 = 300;
		int num4 = num1 + num2 + num3;
		System.out.println(num4);
	}

}
