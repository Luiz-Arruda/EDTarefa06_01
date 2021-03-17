package controller;

public class NO {
	public int dados;			// cria varivel dados
	public NO prox;				// cria o endereço prox a partir do contructor
	
	public NO(int e) {			// contrutor e recebe "e"
		dados = e;				// carrega "e" em dados
		prox = null;			// coloca "null" e prox -- final da lista
	} // fim do contructor
} // fim da classe
