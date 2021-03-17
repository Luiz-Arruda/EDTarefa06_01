package view;

import javax.swing.JOptionPane;

import controller.ListaTemperatura;

public class Main_Temperatura {

	public static void main(String[] args) {
		
		int pos = 0;
		int temperatura = 0;
		int ops = 0;
		
		ListaTemperatura temperatura2 = new ListaTemperatura();
		
		while (ops != 99) {
			 ops = Integer.parseInt(JOptionPane.showInputDialog("Selecione \n1-Status Fila \n2-Adição final lista \n3-Adição inicio da lista \n4-Adição em qualquer posição \n5-Remover do final \n6-Remover Inicio \n7-Remover qualquer posição \n8-Ver Lila \n99-Sair  "));  
			
			switch (ops) {
				case 1:   // status de lista
					if (temperatura2.ListaVazia() == true) {
						System.out.println("Lista está vazia");
					} else {
						System.out.println("Lista contém dados");					
					}
					break;
	
				case 2:
					temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
					temperatura2.AdicionaFinal(temperatura);
					break;
				
				case 3:
					temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
					temperatura2.AdicionaInicio(temperatura);
					break;
					
				case 4:
					temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição de inserção: "));
					temperatura2.escolherposição(temperatura, pos);
					break;
					
				case 5:   // remove no final
//					JOptionPane.showConfirmDialog(null, "O elemento removido foi: " +temperatura2.RemoveFinal());
					System.out.println("O elemento removido foi: " +temperatura2.RemoveFinal());

					break;
					
				case 6:  // remove no inicio
					System.out.println("O elemento removido foi: " +temperatura2.RemoverInicio());
					break;
					
				case 7:  // remover em qualquer posição
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição de remoção: "));
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
			
//			temperatura = Double.parseDouble(JOptionPane.showInputDialog(null; "Informe a temperatura"));
			
} // fim while
		
		

	} // fim do maim
}  // fim da classe 
