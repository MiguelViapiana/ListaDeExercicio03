public class TesteDeAprovacao {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaF;

    public void calcMedia(double n1, double n2, double n3){
        notaF = (n1 + n1 + n3)/3;
            if (notaF < 0 || notaF > 10) {
                System.out.println("[ERRO] notas inválidas!!");
            }else{
                System.out.println("Nome: "+ nome);
                if (notaF >= 7) {
                System.out.println("Situação: APROVADO!!"); 
            }else if(notaF <= 5){
                System.out.println("Situação: REPROVADO!!");
            }else{
                System.out.println("Situação: RECUPERAÇÃO!!");
            }
        }            
    }
}
