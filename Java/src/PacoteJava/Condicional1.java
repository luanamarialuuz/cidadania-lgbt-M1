package PacoteJava;

import java.util.Scanner;

public class Condicional1 {
	
	public static void main (String [] args) { // Função para iniciar o meu programa 
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome; 
		
		System.out.printf("Entre com a sua idade");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Digite o seu nome");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome:   %s", nome);
		System.out.printf("\nSua idade: %d", idade);
		
		if (idade>=18) {
			System.out.printf("\nVocê é maior de idade...");
		}
		else if (idade >=1 && idade<18) {
			System.out.printf("\nVocê é menor de idade..."); 
		}
		else {
			System.out.printf("\n Você entrou com uma idade inválida..");
		}
	}

}
