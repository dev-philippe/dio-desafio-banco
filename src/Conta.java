public abstract class Conta  implements IConta{

    private int agencia;
    private int numero;

    private  double saldo;


    public void sacar() {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void trasferir(double valor, Conta contaDestino) {

    }

    public void depositar() {

    }

    public void trasferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
