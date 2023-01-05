package teste;

public class Carro {
	
	//Criar os atributos da classe carro
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	// metódos
	
	// o método liga vai retonar apenas uma frase

	
	void liga() {
		System.out.println("O carro está ligado...");
	}
	
	// acionando o metódo acelera daremos uma nova velocidade
	// this significa o atributo da minha classe principal 
	
	void acelera (double quantidade) {
		
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	//método para verificar em qual velocidade vou está para poder passar qual marcha o usuário tem que passar
	//sequencia para verificar para retonar alguam informação
	
	int pegaMarcha () {
		
		if(this.velocidadeAtual<0) {
			return -1; //desligado
		}
		if (this.velocidadeAtual >=0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >=40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
		
	}
	
	

}
