import java.util.Scanner;
import java.util.Locale;

public class Bhaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double a, b, c;

		// entro com os 3 coeficientes
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		Double delta = b * b - 4 * a * c;

		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			// calculando as raizes
			delta = Math.sqrt(delta);
			double r1, r2;
			r1 = (-b + delta) / (2 * a);
			r2 = (-b - delta) / (2 * a);

			// imprimindo as raizes
			System.out.printf("R1 = %.5f \n", r1);
			System.out.printf("R2 = %.5f \n", r2);

		}
		input.close();
	}
}
