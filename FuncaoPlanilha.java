package trabalhos;

import javax.swing.JOptionPane;

public class FuncaoPlanilha {
public static void main(String[] args) {
	int opcao = -1;
	double calculo;
	double num1;
	double num2;
	double max = 0.0;
	double min = 0.0;
	String menu = "1- SOMA\n";
	menu += "2- MAXIMO\n";
	menu += "3- MINIMO\n";
	menu += "4- MEDIA\n";
	menu += "0- Sair\n";
	

	
	while (opcao != 0) {
		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));		
		
	switch (opcao) {
		case 1:
			num1 = 0;
			num2 = 0; //for�ar o programa iniciar com valores zerados para cada Op��o
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero:"));
			calculo = num1 + num2;
			JOptionPane.showMessageDialog(null, num1 +" + "+ num2+" = "+calculo);
			break;
		case 2:
			num1 = 0;
			num2 = 0;
			max = Double.MAX_VALUE;
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero:"));
			if (num1>num2) {
				max = num1;
			} else {
				max = num2;
			}
			JOptionPane.showMessageDialog(null, "O maior numero �: "+max);
			break;
		case 3:
			num1 = 0;
			num2 = 0;
			min = Double.MIN_VALUE;
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero:"));
			if (num1<num2) {
				min = num1;
			} else {
				min = num2;
			}
			JOptionPane.showMessageDialog(null, "O menor numero �: "+min);
			break;
		case 4:
			num1 = 0;
			num2 = 0;
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero:"));
			calculo = (num1 + num2) / 2;
			JOptionPane.showMessageDialog(null, "A m�dia entre os numeros � "+calculo);
			
			break;
			
			
	}
			
}
}
}
