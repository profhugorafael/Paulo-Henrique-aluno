import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		int[] a = new int [100];
		
		for(int i=0; i<100; i++) {
			
			a[i] = input.nextInt(); 
			
			if (a[i]<=10) {
				System.out.println("A[" +i +"] = " + a[i]);
			}
				
			
			
			
		}

		input.close();
	}

}
