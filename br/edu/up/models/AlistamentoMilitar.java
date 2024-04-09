package br.edu.up.models;

public class AlistamentoMilitar {
    private String[] nome;
    private String[] sexo;
    private int[] idade;
    private int[] saude;
    private boolean[] apto;
    private int qtdpessoas;
    private int qtdAptas = 0;

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

    public int getQtdpessoas() {
        return qtdpessoas;
    }

    public void setQtdpessoas(int qtdpessoas) {
        this.qtdpessoas = qtdpessoas;
    }

    public String getNome(int num) {
        return nome[num];
    }

    public void setNome( int num,String nome) {
        this.nome[num] = nome;
    }

    public String getSexo(int num) {
        return sexo[num];
    }

    public void setSexo(int num, String sexo) {
        this.sexo[num] = sexo;
    }

    public void setIdade(int num ,int idade) {
        this.idade[num] = idade;
    }

    public void setSaude( int num,int saude) {
        this.saude[num] = saude;
    }

    public boolean getApto(int num) {
        return apto[num];
    }

    public void setQtdAptas(int num) {
        this.qtdAptas += num;
    }

    public int getQtdAptas() {
        return qtdAptas;
    }
    
    
    
    
    

}
