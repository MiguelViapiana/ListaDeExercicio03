package br.edu.up.models;

public class Seguradoria {
    private String nome;
    private int idade;
    private int categoria;
    private String grupoDeRisco;

    public void calcSeguro(){
        if (idade >= 17 && idade <=70) {
            if(grupoDeRisco.toLowerCase().equals("baixo") || grupoDeRisco.toLowerCase().equals("medio") || grupoDeRisco.toLowerCase().equals("alto")){
               if (idade <=20){
                    if (grupoDeRisco.equals("Baixo")) {
                        categoria = 1;
                    }else if (grupoDeRisco.equals("Medio")) {
                        categoria = 2;
                    }else{
                        categoria = 3;
                    }
                }else if(idade <=24){
                    if (grupoDeRisco.equals("Baixo")) {
                        categoria = 2;
                    }else if (grupoDeRisco.equals("Medio")) {
                        categoria = 3;
                    }else{
                        categoria = 4;
                    }
                }else if(idade <= 34){
                    if (grupoDeRisco.equals("Baixo")) {
                        categoria = 3;
                    }else if (grupoDeRisco.equals("Medio")) {
                        categoria = 4;
                    }else{
                        categoria = 5;
                    }
                }else if (idade <=64) {
                    if (grupoDeRisco.equals("Baixo")) {
                        categoria = 4;
                    }else if (grupoDeRisco.equals("Medio")) {
                        categoria = 5;
                    }else{
                        categoria = 6;
                    }
                }else{
                    if (grupoDeRisco.equals("Baixo")) {
                        categoria = 7;
                    }else if (grupoDeRisco.equals("Medio")) {
                        categoria = 8;
                    }else{
                        categoria = 9;
                    }
                }
            }else{
                System.out.println("Grupo de risco inválido!!");
            }
            
        }else{
            System.out.println("Idade inválida para seguro!");
        }
    }

    public void setNome(String nome) {
        

        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 17 && idade <=70) {
            this.idade = idade;
        }else{
            this.idade = 0;
        }
        
    }

    public void setGrupoDeRisco(String grupoDeRisco) {
        if(grupoDeRisco.toLowerCase().equals("baixo") || grupoDeRisco.toLowerCase().equals("medio") || grupoDeRisco.toLowerCase().equals("alto")){
            this.grupoDeRisco = grupoDeRisco;
        }else{
            this.grupoDeRisco = "";
        }
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getGrupoDeRisco() {
        return grupoDeRisco;
    }
    
    
}
