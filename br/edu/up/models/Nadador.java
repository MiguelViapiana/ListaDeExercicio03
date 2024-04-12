package br.edu.up.models;

public class Nadador {
    private int idade;
    private String categoria;

    public void categoriaIdade() {

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade <= 10) {
            categoria = "Infantil B";
        } else if (idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade <= 25) {
            categoria = "Sênior";
        } else {
            System.out.println("Idade fora da faixa etária!");
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
