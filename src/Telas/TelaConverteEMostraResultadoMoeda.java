package Telas;

import javax.swing.JOptionPane;

public class TelaConverteEMostraResultadoMoeda extends Conversor {

    public TelaConverteEMostraResultadoMoeda(double valor, String op) {
        converter(valor, op);

        String msg = String.format("O valor convertido foi %s %.7f", super.simboloConversao, super.valorConvertido);

        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {

        switch (op) {
            case "De Reais a Dólares" -> {
                super.simboloConversao = "U$";
                super.valorConvertido = valor * 0.19246678;
            }
            case "De Reais a Euros" -> {
                super.simboloConversao = "€";
                super.valorConvertido = valor * 0.18085374;
            }
            case "De Reais a Libras Esterlinas" -> {
                super.simboloConversao = "£";
                super.valorConvertido = valor * 0.15999766;
            }
            case "De Reais a Peso Argentino" -> {
                super.simboloConversao = "$";
                super.valorConvertido = valor * 38.137936;
            }
            case "De Reais a Peso Chileno" -> {
                super.simboloConversao = "CLP";
                super.valorConvertido = valor * 154.53951;
            }
            case "De Reais a Yenes" -> {
                super.simboloConversao = "JPY";
                super.valorConvertido = valor *  26.14;
            }
            case "De Reais a Won Sul Coreano" -> {
                super.simboloConversao = "KRW";
                super.valorConvertido = valor * 249.67627 ;
            }
            case "De Dólares a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.19585;
            }
            case "De Euros a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.5279951;
            }
            case "De Libras Esterlinas a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 6.2500933 ;
            }
            case "De Peso Argentino a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.0262206;
            }
            case "De Peso Chileno a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.00647099 ;
            }
            case "De Yenes a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.04;
            }

            case "De Won Sul Coreano a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.00400912 ;
            }
        }
    }
}
