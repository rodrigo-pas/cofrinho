package br.uninter.rodrigo.cofrinho;

// Classe Real que herda de Moeda
public class Real extends Moeda {

    public Real(double valor) {
        super(valor); // Chama o construtor da classe Moeda
    }

    // Sobrescreve o método info para retornar informações sobre o Euro
    @Override
    public String info() {
        return "Real: " + valor; // Retorna uma string com o valor do Euro
    }

    @Override
    public double converter() {
        // Não precisa de conversão, retorna o próprio valor em Real
        return valor;
    }
}
