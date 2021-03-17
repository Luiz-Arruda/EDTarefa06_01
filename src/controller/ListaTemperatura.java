package controller;

import javax.swing.JOptionPane;

public class ListaTemperatura {
	private NO inicio;			// define a variavel de inicio com base na classe NO
	
	public ListaTemperatura() {		// cria o constructor
		inicio = null;				// carrega inicio como null para idenficar a lista como vazia
	} // fim do constructor
	
	public boolean ListaVazia() {	// 1 - status da lista
		if (inicio == null) {
			return true;			// lista vazia
		}
		return false;				// lista preencida
	} // fim Lista Vazia
	
	public void AdicionaFinal(int e) { 	// 2 -  cria metodo adicionar no final da lista
		if (inicio == null) {			// verifica se a lista está vazia
			NO n = new NO(e);			// carrega o valor de "e" no nó criado
			inicio = n;					// carrega inicio com "n" - novo nó criado
		}  // fim if
		else {
			try {
				NO aux = inicio;				// cria endereço de nó "aux" e carrega com o endereço de inicio
				while (aux.prox != null) {		// prox vem da classe contructor NO
					aux = aux.prox;				// vai movendo aux para a proximo endereço
				} // fim while
				NO n = new NO(e);				// cria um novo nó com endereço "n" e carrega dado "e"
				aux.prox = n;						// carrega n aux o endereço de n		
			} catch (Exception e2) {
				System.out.println("Erro de gravação");
			}
		}  // fim do else
	} // fim do metodo
	
	public void AdicionaInicio(int e) {			// 3 adicionar no inicio da lista
		NO n = new NO(e);						// criando novo no "n"
		n.prox = inicio;						// carregar n com o proxima endereço
		inicio = n;								// carrecar incio n
	}
	
	public int RemoveFinal() {					// 4 remover no final da lista
		int r = -1;								// criar uma variavel 
		if (inicio == null ) {
			JOptionPane.showConfirmDialog(null, "Lista Vázia");
		}
		else {
			if (inicio.prox == null) {			// inicio é o primeiro elemento da lista
				r = inicio.dados;				// carregar a variavel com o conteudo do dado
				inicio = null;					// informa que é o ultimo elemento da lista
			} // fim IF
			else {
				NO aux1 = inicio;			// gerando duas varias, uma para varrer a lista
				NO aux2 = inicio;
				
				while (aux1.prox !=null) {  // varrendo a lista até encontrar null
					aux2 = aux1;			// guarda o endereço no utimo endereço em aux2
					aux1 = aux1.prox;		// pega o proximo endereço
				} // fim while
				
				r = aux1.dados;				// guarda em "r" o dado de aux1
				aux2.prox = null;			// coloca null para mostrar o fim da lista. 
			} // fim else
		} // fim else
		return r;
	} // fim classe
	
	public int RemoverInicio() {			// 5 remover no inico da lista
		int r = -1;
		if (inicio == null) {
			JOptionPane.showConfirmDialog(null, "Lista Vazia");
		} // fim inicio 
		else {
			r = inicio.dados;			// carrenda o conteudo dados em "r"
			inicio = inicio.prox;			// passar para inicio o enderço do proximos endereço
		} // fim else
		return r;
	} // fim da classe Remove Inicio
	
	public void escolherposição(int e, int pos) {
		NO novo = new NO(e);		
		
		if (pos == 1) {
			AdicionaInicio(e);
		} // fim IF
		
		else {
			NO aux = inicio;			// armazena posição inicio no auxiliar
			int cont = 1;				// criação contador com 1
			
			while (aux.prox != null && cont < pos-1) {  // localização da posição
				aux = aux.prox;			// armazena o endereça de proximo de aux em aux
				cont ++;
			} // fim while
			
			if (cont == pos-1) {  		// inserção na posição desejada passou a ser fora do laço
				novo.prox = aux.prox;	// liga novo indicaçao do endereço de pos-1
				aux.prox = novo;		// pos - 1 aponta para o "novo"
			} //fim IF
			else {
				JOptionPane.showConfirmDialog(null, " Posição Inválida");
			} // fim else
		} // fim else
	} // classe inserir em qualquer posição
	
	public int EscolheRemover(int pos) {
		int e = -1;
		int i = 1; 
		NO aux = inicio;	// criar um endereçamento aux com valor inicial
		
		if (inicio == null) {
			JOptionPane.showConfirmDialog(null, "Lista Vazia !");
			return e;
		} // fim IF
		if (pos == 1) {  // remoção pos = 1, remoção será no inicio da lista
			e = RemoverInicio();
			return e;
		} // Fim IF
		else {
			while (aux.prox != null) {  // remover no final da lista
				aux = aux.prox;   // guarda no aux o endereço do proximo da posição
				i++;				// vai guardando os posiçoes ate encontral null
			} // fim While
			if (pos > i || pos <=0) {  // posicoes invalidas
				JOptionPane.showConfirmDialog(null, "Posição invalida");
				return e;
			} // fim IF
			else if (pos == i){			// Remoção no final
				e = RemoveFinal();
				return e;
			} // fim else
			else {						// remover qualquer posição
				aux = inicio;			// carrega aux com inicio
				NO aux2 = aux;			// cria endereçamenteo aux 2 e copia aux
				
				while(pos > 1) {
					aux2 = aux;
					aux = aux.prox;
					pos --;
				} // while
				e = aux.dados;
				aux2.prox = aux.prox;
				return e;
			} // fim else
		} // fim else
	} // fim da classe escolha Remover
	
	
	public void PercorreLista() {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} // if
		else {
			NO aux1 = inicio;	// criação de duas variaveis
			
			while (aux1 != null) {
//				JOptionPane.showConfirmDialog(null, aux1.dados);
				System.out.println(aux1.dados);
				aux1 = aux1.prox;
			}
		} // fim else
	} // fim percorre lista
	
} // fim da classe
