programa
{
	
	funcao inicio()
	{
		inteiro hr, min, s, rm, rs

		escreva("\n Escreva o tempo em segundos ")
		leia(s)

		min = s / 60
		rs = s % 60
		
		hr = min / 60
		rm = min % 60
		
		
		escreva("\n O tempo total é: " , hr , " : " , rm , " : " , rs)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */