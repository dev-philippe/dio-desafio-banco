public interface IConta {
    void sacar(double valor);


    void depositar(double valor);


    void trasferir(double valor, IConta contaDestino);

    void imprimirExtrato();


}
