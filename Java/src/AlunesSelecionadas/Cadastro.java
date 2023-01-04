package AlunesSelecionadas;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int a, b, soma;
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		soma = a + b;
		System.out.println("O resultado da adição é: " + soma);
		
		
		

	}

}
