package br.uninter.rodrigo.cofrinho;

// Classe Euro que herda de Moeda
public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor); // Chama o construtor da classe Moeda
    }

    // Sobrescreve o método info para retornar informações sobre o Euro
    @Override
    public String info() {
        return "Euro: " + valor; // Retorna uma string com o valor do Euro
    }

    // Sobrescreve o método converter para converter o valor do Euro
    @Override
    public double converter() {
        return valor * 6.5; // Retorna o valor do Euro convertido para Real
    }
}
