import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, menor=0,posicaoMenor=0;

		n = input.nextInt();
		
		int[] v = new int[n];
		
		for(int i=0; i<v.length; i++) {
			
			v[i] = input.nextInt(); 
			
			if (i==0) {
				menor=v[i];
				posicaoMenor=i;
			}else if(menor>v[i]) {
				menor=v[i];
				posicaoMenor=i;
			}
		}
		System.out.println("Menor valor: "+ menor);
		System.out.println("Posicao: "+ posicaoMenor);
		
		input.close();
	}

}
