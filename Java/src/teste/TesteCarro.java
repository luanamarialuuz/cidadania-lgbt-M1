package teste;

public class TesteCarro {

	public static void main(String[] args) {
		
		//instanciar o carro
		Carro meuCarro = new Carro();
		
		//caracteristas do meu carro inicializacão dos atributos
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//chamar os metodos
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		
		
		
		
		

	}

}
