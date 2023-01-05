package teste;

public class MetodoSobrecarregado {
	
	//metodo sem retorno
	
	public void TestaMetodosSobreCarregados()
	{
		System.out.printf("Salário em número inteiro: %d \n", salario(1000));
		System.out.printf("Salário em número doouble: %f \n", salario(7.500));
	}
	
	
	// criação de métodos com o mesmo nome -> salario porém com parâmentros diferentes
	public int salario (int valorInt) 
	{
		System.out.printf("Salário com argumento inteiro: %d \n", valorInt);
		return valorInt * valorInt; 
	}
	
	
	public double salario (double valorDouble) 
	{
	
		System.out.printf("Salário com argumento double: %f \n", valorDouble);
		return valorDouble * valorDouble; 
		
	}

}
