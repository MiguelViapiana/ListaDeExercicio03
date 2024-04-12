package br.edu.up.models;

public class Notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaF;
    public String situacao;

    public void calcMedia(){
        notaF = (nota1 + nota2 + nota3)/3;
            if (nota1 == -1 || nota2 == -1 || nota3 == -1) {
                situacao ="[ERRO] notas inválidas!!";
            }else{
                if (notaF >= 7) {
                situacao ="Situação: APROVADO!!";
            }else if(notaF <= 5){
                situacao ="Situação: REPROVADO!!";
            }else{
                situacao="Situação: RECUPERAÇÃO!!";
            }
        }            
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }else{
            this.nota1 = -1;
        }
        
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }else{
            this.nota2 = -1;
        }
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        }else{
            this.nota3 = -1;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSituacao() {
        return situacao;
    }
    

    
}
