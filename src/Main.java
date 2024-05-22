
public class Main {
    public static void main(String[] args) {

        IConta cc = new ContaCorrente();
        cc.depositar(100);

        IConta poupanca = new ContaPoupanca();

        cc.trasferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}