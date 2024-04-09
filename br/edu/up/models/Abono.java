package br.edu.up.models;

public class Abono {
    private String nome;
    private String sexo;
    private int idade;
    private double salarioFixo;
    private double salarioLiquido;

    public void calcAbono() {
        if (sexo.equals("M")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 100;
            } else {
                salarioLiquido = salarioFixo + 50;
            }
        }
        if (sexo.equals("F")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 200;
            } else {
                salarioLiquido = salarioFixo + 80;
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        if(sexo.equals("M") && sexo.equals("F")){
            System.out.println("Sexo inválido!!");
            this.sexo = "";
        }else{
            this.sexo = sexo;
        }
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
            this.idade = 0;
        }else{
            this.idade = idade;
        }
    }

    public void setSalarioFixo(double salarioFixo) {
        if (salarioFixo < 0) {
            System.out.println("Salário inválido!!");
            this.salarioFixo = 0;
        }else {
            this.salarioFixo = salarioFixo;
        }
        
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    
}
