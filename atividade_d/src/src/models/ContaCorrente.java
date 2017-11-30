package src.models;



public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void atualizar(double taxa) {
        super.atualizar(taxa * 2);
    }

    public void depositar(double valor) {
       super.depositar(valor - 0.10);
    }


}
