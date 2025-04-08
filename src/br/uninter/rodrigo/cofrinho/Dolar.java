package br.uninter.rodrigo.cofrinho;

// Classe Dolar que herda de Moeda
public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor); // Chama o construtor da classe Moeda
    }

    // Sobrescreve o método info para retornar informações sobre o Dolar
    @Override
    public String info() {
        return "Dolar: " + valor; // Retorna uma string com o valor do Dolar
    }

    // Sobrescreve o método converter para converter o valor do Dolar
    @Override
    public double converter() {
        return valor * 5.5; // Retorna o valor do Dolar convertido para Real
    }
}
