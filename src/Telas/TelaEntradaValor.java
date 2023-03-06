package Telas;

import javax.swing.JOptionPane;

public class TelaEntradaValor {

	// private Integer resposta;
    private final String valor;
    
    public TelaEntradaValor() {
    	valor = JOptionPane.showInputDialog(null, "Insira um valor:");
 }

    public double getValor() throws NumberFormatException {
        return Double.parseDouble(this.valor);  
    }
}