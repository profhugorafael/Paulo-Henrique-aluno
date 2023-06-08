import java.util.Scanner;
import java.util.Locale;


public class Experimento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n, Amount, Coelho=0, Rato=0, Sapo=0;
		String Type;
		


		n = input.nextInt();

		for (int x=0; x<n; x++ ){


			Amount = input.nextInt();
			Type = input.next();
			

			if (Type.equals ("C")){
				Coelho += Amount;

			} else if (Type.equals ("R")){
				Rato += Amount;

			}else{
				Sapo += Amount;
			}

		}
		
		int Total = Coelho + Rato + Sapo;
		double pCoelho = ((double)Coelho/(double)Total)*100;
		double pRato = ((double)Rato/(double)Total)*100;
		double pSapo = ((double)Sapo/(double)Total)*100;

		System.out.printf("Total: %d cobaias\n", Total);
		System.out.printf("Total de coelhos: %d\n", Coelho);
		System.out.printf("Total de ratos: %d\n", Rato);
		System.out.printf("Total de sapos: %d\n", Sapo);
		System.out.printf("Percentual de coelhos: %.2f %%\n", pCoelho);
		System.out.printf("Percentual de ratos: %.2f %%\n", pRato);
		System.out.printf("Percentual de sapos: %.2f %%\n", pSapo);
		
		
		input.close();
	



	}

}
