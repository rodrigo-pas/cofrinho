package br.uninter.rodrigo.cofrinho;

// Classe Moeda como abstrata
public abstract class Moeda {
    protected double valor;

    // Construtor da classe Moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato para retornar informações da moeda
    public abstract String info();

    // Método abstrato para converter o valor da moeda para Real
    public abstract double converter();

    // Getter para acessar o valor da moeda
    public double getValor() {
        return valor;
    }
}
