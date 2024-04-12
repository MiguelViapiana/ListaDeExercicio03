package br.edu.up.models;

public class Pessoa {
    private String[] nome = new String[5];
    private String[] sexo = new String[5];
    private int qtdM = 0;
    private int qtdF = 0;

    public void contarSexos() {
        for (int i = 0; i < 5; i++) {
            if (!sexo[i].equals("M") && !sexo[i].equals("F")) {
                System.out.println("Sexo inválido digite M ou F");
            } else if (sexo[i].equals("M")) {
                qtdM++;
            } else if (sexo[i].equals("F")) {
                qtdF++;
            }
        }
        
    }

    public void setNome(int num, String nome) {
        this.nome[num] = nome;
    }

    public void setSexo( int num,String sexo) {
        this.sexo[num] = sexo;
    }

    public String getNome(int num) {
        return nome[num];
    }

    public String getSexo(int num) {
        return sexo[num];
    }

    public int getQtdM() {
        return qtdM;
    }

    public int getQtdF() {
        return qtdF;
    }
    

}
