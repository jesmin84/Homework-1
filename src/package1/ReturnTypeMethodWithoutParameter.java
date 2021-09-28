package package1;

public class ReturnTypeMethodWithoutParameter {

	public static void main(String[] args) {

		ReturnTypeMethodWithoutParameter.doCalculation();

		ReturnTypeMethodWithoutParameter.getAge();

		ReturnTypeMethodWithoutParameter js = new ReturnTypeMethodWithoutParameter();
		js.getValue();

		
		js.getSalary();

		
		js.getGrade();

	};

	public static String doCalculation() {
		String name1 = "Nazmul";
		double num1 = 5000.00;
		double num2 = 6000.00;
		double num3 = num1 + num2;
		System.out.println(num3);
		System.out.println(name1);
		return name1;
	}

	public static int getAge() {
		int age2 = 50;
		System.out.println("Her age is " + age2);

		return age2;
	}

	public int getValue() {
		int price = 55;
		System.out.println("book price is " + price);

		return price;
	}

	public int getSalary() {
		int salary = 2000;
		System.out.println("His salary is " + salary);

		return salary;
	}

	public int getGrade() {
		int grade = 10;
		System.out.println("His grade is " + grade);

		return grade;

	}

}
