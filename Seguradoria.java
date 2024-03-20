public class Seguradoria {
    public String nome;
    public int idade;
    public int categoria;
    public String grupoDeRisco;

    public void calcSeguro(){
        nome = Prompt.lerLinha("Digite o seu nome: ");
        idade = Prompt.lerInteiro("Digite a sua idade: ");
        grupoDeRisco = Prompt.lerLinha("Digite o seu grupo de risco(Baixo, Medio, Alto)");
        if (idade >= 17 && idade <=70) {
            if(grupoDeRisco.equals("Baixo") || grupoDeRisco.equals("Medio") || grupoDeRisco.equals("Alto")){
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
                System.out.printf("Nome: %s | Idade: %d | Grupo de Risco: %s | Categoria: %d", nome, idade, grupoDeRisco, categoria);
            }else{
                System.out.println("Grupo de risco inválido!!");
            }
            
        }else{
            System.out.println("Idade inválida para seguro!");
        }
    }
}
