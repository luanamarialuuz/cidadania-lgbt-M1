package Testes;

public class TestandoFuncionario {

	public static void main(String[] args) {
	
		// estanciar funcionario criar um novo objeto
		Funcionario func = new Funcionario ();
		
		func.setNome("Manu");
		func.setSalario(3000);
		
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		

	}

}
