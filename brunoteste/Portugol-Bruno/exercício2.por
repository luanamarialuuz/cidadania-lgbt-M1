programa
{
	
	funcao inicio()
	{
	inteiro idade, mesnasc, dtnasc, mesatual, dtatual, diastotais, diasvivatual, diasvivnasc

	escreva("Digite o mês de nascimento ")
	leia(mesnasc)

	escreva("Digite a data que nasceu ")
	leia(dtnasc)

	escreva("Digite o mês atual ")
	leia(mesatual)

	escreva("Digite a data atual ")
	leia(dtatual)

	escreva("Digite sua idade ")
	leia(idade)

	diasvivatual = (mesatual - 1) * 30 + dtatual

	diasvivnasc = 365 - (mesnasc - 1) * 30 + dtnasc
	
	diastotais = (idade - 1) * 365 + (diasvivnasc + diasvivatual)
	 
	escreva("você viveu ", diastotais, " dias")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */