package PacoteJava;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	
		
		double n1,n2,n3,media;
		int op;
		
		Scanner leia = new Scanner(System.in);
				
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat(); 
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat(); 
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
		
		media = (n1+n2+n3) /3;
		System.out.println("\n Média: " +media);
		System.out.printf("\nMédia: %2.2f",media);
		
		//Se não
		if (media >=7 && media<=10) { 
			System.out.println("\nAlune aprovade!!!");
		}
		else if (media >=5 && media<7) {
			System.out.println("\nAlune de exame!!!");
		}
		else {
			System.out.println("\nAlune reprovade");
		}
		
	}

}
