package ch6;

public class AssertionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] grades = { 3.8, 1.2, 2.0, 1, 4 };
		for (double grade : grades) {
			try {
				System.out.println(grade + " - input");
				assert grade > aveCalc(grades) : grade;
				System.out.println(grade + " - output");
			} catch (Throwable e) {
				System.err.printf("ERROR - %s%n", grade);
			}
		}
	}

	private static double aveCalc(double[] grades) {
		// TODO Auto-generated method stub

		double sum = 0;
		for (double num : grades)
			sum += num;

		return (double) sum / grades.length;
	}

}
