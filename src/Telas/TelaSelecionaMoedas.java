package Telas;

import javax.swing.JOptionPane;


public class TelaSelecionaMoedas {

    private final String opcaoSelecionada;

    public TelaSelecionaMoedas() {
        String[] opcoes = {
                "De Reais a Dólares",
                "De Reais a Euros",
                "De Reais a Libras Esterlinas",
                "De Reais a Peso Argentino",
                "De Reais a Peso Chileno",
                "De Reais a Yenes",
                "De Reais a Won Sul Coreano",
                "De Dólares a Reais",
                "De Euros a Reais",
                "De Libras Esterlinas a Reais",
                "De Peso Argentino a Reais",
                "De Peso Chileno a Reais",
                "De Yenes a Reais",
                "De Won Sul Coreano a Reais"
        };
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja converter seu dinheiro:",
                "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcaoSelecionada;
    }
}
