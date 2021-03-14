package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

import java.util.Calendar;

public class ContaCorrente extends Conta {
    private TipoConta tipo;

    public ContaCorrente() {
    }

    public ContaCorrente(TipoConta tipo) {
        this.tipo = tipo;
    }

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipo = tipo;
    }
    
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (tipo == TipoConta.COMUM && saldo - valor < 0) {
            throw new SaldoInsuficienteException(saldo);
        }
        this.saldo -= valor;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }
}
