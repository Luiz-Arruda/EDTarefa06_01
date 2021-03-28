package view;

import javax.swing.JOptionPane;

import controller.ListaTemperatura;

public class Main_Temperatura {

	public static void main(String[] args) {
		
		int pos = 0;
		double temperatura = 0;
		int ops = 0;
		
		ListaTemperatura temperatura2 = new ListaTemperatura();
		
		while (ops != 99) {
			 ops = Integer.parseInt(JOptionPane.showInputDialog("Selecione \n1-Status Fila \n2-Adi��o final lista \n3-Adi��o inicio da lista \n4-Adi��o em qualquer posi��o \n5-Remover do final \n6-Remover Inicio \n7-Remover qualquer posi��o \n8-Ver Lila \n99-Sair  "));  
			
			switch (ops) {
				case 1:   // status de lista
					if (temperatura2.ListaVazia() == true) {
						System.out.println("Lista est� vazia");
					} else {
						System.out.println("Lista cont�m dados");					
					}
					break;
	
				case 2:
					temperatura = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura: "));
					temperatura2.AdicionaFinal(temperatura);
					break;
				
				case 3:
					temperatura = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura: "));
					temperatura2.AdicionaInicio(temperatura);
					break;
					
				case 4:
					temperatura = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura: "));
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o de inser��o: "));
					temperatura2.escolherposi��o(temperatura, pos);
					break;
					
				case 5:   // remove no final
					System.out.println("O elemento removido foi: " +temperatura2.RemoveFinal());

					break;
					
				case 6:  // remove no inicio
					System.out.println("O elemento removido foi: " +temperatura2.RemoverInicio());
					break;
					
				case 7:  // remover em qualquer posi��o
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o de remo��o: "));
					System.out.println("O elemento removido foi: " +temperatura2.EscolheRemover(pos));
					break;
				
				case 8:   // apresentar lista
					temperatura2.PercorreLista();
					break;
					
				case 99:
					System.out.println("saindo");
					break;
					
				default:
					break;
				}
			} // fim while
	} // fim do maim
}  // fim da classe 
