package br.edu.up.models;

public class NomeSex {
    public String[] nome = new String[56];
    public String[] sexo = new String[56];
    public int qtdM = 0;
    public int qtdF = 0;

    public void contarSexos() {
        for (int i = 0; i < 56; i++) {
            if (!sexo[i].equals("M") && !sexo[i].equals("F")) {
                System.out.println("Sexo inválido digite M ou F");
            } else if (sexo[i].equals("M")) {
                qtdM++;
            } else if (sexo[i].equals("F")) {
                qtdF++;
            }
        }
    }

}
