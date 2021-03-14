package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {
    private float taxa;
    public static final float RENDIMENTO = 0.04f;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
    }

    @Override
    public double calculoRetornoInvestimento() {
        return saldo * RENDIMENTO;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor + taxa > saldo) {
            throw new SaldoInsuficienteException(saldo);
        }
        saldo -= valor + taxa;

    }
}
