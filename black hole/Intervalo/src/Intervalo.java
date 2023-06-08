import java.util.Scanner;
import java.util.Locale;


public class Intervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n, a, b, c; 
		b=0;
		c=0;
		

		n = input.nextInt();

		for (int x=0; x<n; x++ ){
			
			a = input.nextInt();

			if( a<10 || a>20) {
				b++;
			
			} 
			else {
				c++;
			}



		}

		System.out.println(c + " in");
		System.out.println(b + " out");
		
		input.close();




	}

}
