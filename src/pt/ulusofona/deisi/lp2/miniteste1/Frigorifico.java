package pt.ulusofona.deisi.lp2.miniteste1;

import java.util.ArrayList;
import java.util.List;

public class Frigorifico {
    int capacidade;
    private ArrayList<String> tipos;
    int quantidade;


    public Frigorifico() {

    }


    public Frigorifico(int capacidade, ArrayList<String> tipos) {
        this.capacidade = capacidade;
        this.tipos = tipos;


    }


    public void adicionar(String alimento, int quantidade) {

        if (tipos.contains(alimento) == true) {

            int quantidadeNoTotal = quantidade++;
            if (quantidadeNoTotal <= capacidade) {
                tipos.add(alimento);

            }
        }

    }

    public int obterNumeroTiposAlimentosValidos() {
        return tipos.size();
    }

    @Override
    public String toString() {
        return "<" + capacidade + ">" +"|"+ "<" + quantidade + "<" +"|"+ tipos + ">";
    }
}










