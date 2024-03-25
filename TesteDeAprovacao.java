public class TesteDeAprovacao {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaF;
    public String situacao;

    public void calcMedia(){
        notaF = (nota1 + nota2 + nota3)/3;
            if (notaF < 0 || notaF > 10) {
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
}
