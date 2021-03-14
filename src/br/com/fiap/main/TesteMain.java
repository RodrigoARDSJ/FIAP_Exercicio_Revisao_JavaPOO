package br.com.fiap.main;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteMain {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 2343, Calendar.getInstance(),
                100, TipoConta.COMUM);

        ContaPoupanca cp = new ContaPoupanca(1, 12331,
                new GregorianCalendar(2021, Calendar.APRIL, 1), 200, 1);
        try {
            cc.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
