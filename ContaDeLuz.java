public class ContaDeLuz {
    public int tipoDeCliente;
    public int KWH;
    public double contaFinal;

    public void calcContaDeLuz() {

        if (tipoDeCliente == 1 || tipoDeCliente == 2 || tipoDeCliente == 3) {
            if (tipoDeCliente == 1) {
                contaFinal = KWH * 0.60;
            } else if (tipoDeCliente == 2) {
                contaFinal = KWH * 0.48;
            } else {
                contaFinal = KWH * 1.29;
            }
        } else {
            System.out.println("Tipo de cliente inválido!");
        }
    }
}
