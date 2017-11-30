package src.models;


public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void atualizar(double taxa) {
        super.atualizar(taxa * 2);
    }


}
