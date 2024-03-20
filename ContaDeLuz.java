public class ContaDeLuz {
    public int tipoDeCliente;
    public int KWH;
    public double contaFinal;

    public void calcContaDeLuz(){
        System.out.println("Tipo de cliente: \n1(Residência)\n2(Comércio)\n3(Indústria)");
        tipoDeCliente = Prompt.lerInteiro("Digite o seu tipo de cliente: ");
        KWH = Prompt.lerInteiro("Insira quatos KW/H foram gastos ao todo no mês: ");
        if (tipoDeCliente == 1 || tipoDeCliente == 2 || tipoDeCliente == 3) {
            if (tipoDeCliente ==1) {
                contaFinal = KWH * 0.60;
            }else if (tipoDeCliente == 2) {
                contaFinal = KWH * 0.48;
            }else{
                contaFinal = KWH * 1.29;
            }
        }else{
            System.out.println("Tipo de cliente inválido!");
        }
        System.out.printf("A conta de energia ficou no total de: R$ %.2f",contaFinal);
    }
}
