package src.ui;
import src.models.Conta;
import src.models.ContaCorrente;
import src.models.ContaPoupanca;
import src.models.AtualizadorDeContas;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(3000);
        ContaCorrente cc = new ContaCorrente(4000);
        ContaPoupanca cp = new ContaPoupanca(5000);
        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);

        System.out.println("Saldos antes atualizacao");
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Atualizados");
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        System.out.println("-------------");
        System.out.println(adc.getSaldoTotal());
    }
}