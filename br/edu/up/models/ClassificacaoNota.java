package br.edu.up.models;

public class ClassificacaoNota {
        public String nome;
        public int matricula;
        public String classificaçao;
        public double lab;
        public double avsem;
        public double examfinal;
        public double media;
    
        public void calcMediaClassificacao(){
            
            if (lab < 0 || lab >10 || avsem < 0 || avsem >10 || examfinal < 0 || examfinal >10) {
                System.out.println("Nota inválida!!");
            }else{
                media = ((lab * 2) +(avsem * 3)+ (examfinal* 5))/10; 
                if(media <= 5){
                    classificaçao = "R";
                }else if (media <=6) {
                    classificaçao = "D";
                }else if (media <= 7) {
                    classificaçao = "C";
                }else if (media <= 8) {
                    classificaçao = "B";
                }else{
                    classificaçao = "A";
                }
            }

            
        }
}
