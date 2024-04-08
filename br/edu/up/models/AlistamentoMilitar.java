package br.edu.up.models;

public class AlistamentoMilitar {
    public String[] nome;
    public String[] sexo;
    public int[] idade;
    public int[] saude;
    public boolean[] apto;
    public int qtdpessoas;
    public int qtdAptas = 0;

    public void declararArrays() {
        nome = new String[qtdpessoas];
        sexo = new String[qtdpessoas];
        idade = new int[qtdpessoas];
        saude = new int[qtdpessoas];
        apto = new boolean[qtdpessoas];
    }

    public void aptoPelaIdade(int p) {
        if (idade[p] < 18) {
            apto[p] = false;
        } else {
            apto[p] = true;
        }

    }

    public void aptoPelaSaude(int p) {
        if (saude[p] == 1 && apto[p] == true) {
            apto[p] = true;
        } else if (saude[p] == 1 && apto[p] == false) {
            apto[p] = false;
        } else if (saude[p] == 2) {
            apto[p] = false;
        } else if (saude[p] != 1 && saude[p] != 2) {
            System.out.println("Entrada de dados inválida, tente novamente.");
        }
    }

}
