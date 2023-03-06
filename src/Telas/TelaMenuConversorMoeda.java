package Telas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TelaMenuConversorMoeda {

	// private final String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };

	private final String opcaoSelecionada;
         
	public TelaMenuConversorMoeda() {

		String initialSelection = "Conversor de moedas";

		JDialog.setDefaultLookAndFeelDecorated(true);

		Object[] selectionValues = {"Conversor de moedas", "Conversor de temperatura"};

		opcaoSelecionada =
			(String) JOptionPane.showInputDialog(null,"Escolha o tipo de conversão",         
				"Conversão", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);   
	}

	public String getOpcaoSelecionada() { 
		return this.opcaoSelecionada;
		
	}
}
