package br.uninter.rodrigo.cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    private List<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada ao cofrinho: " + moeda.info());
    }

    public void remover(String tipo, double valor) {
        Moeda moedaEncontrada = null;
        for (Moeda moeda : listaMoedas) {
            if (moeda.getValor() == valor && moeda.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                moedaEncontrada = moeda;
                break;
            }
        }

        if (moedaEncontrada != null) {
            listaMoedas.remove(moedaEncontrada);
            System.out.println("Moeda removida do cofrinho: " + moedaEncontrada.info());
        } else {
            System.out.println("Moeda não encontrada no cofrinho com o tipo e valor especificados.");
        }
    }

    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
        } else {
            System.out.println("\nMoedas no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                System.out.println(moeda.info());
            }
        }
    }

    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }

    public List<Moeda> getListaMoedas() {
        return listaMoedas;
    }
}
