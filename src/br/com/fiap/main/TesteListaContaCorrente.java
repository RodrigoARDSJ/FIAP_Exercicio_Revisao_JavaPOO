package br.com.fiap.main;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteListaContaCorrente {
    public static void main(String[] args) {
        List<ContaCorrente> lista = new ArrayList<>();
        lista.add(new ContaCorrente(1, 34234, Calendar.getInstance(), 900, TipoConta.PREMIUM));
        lista.add(new ContaCorrente(2, 378678, Calendar.getInstance(), 1500, TipoConta.COMUM));
        lista.add(new ContaCorrente(3, 3423332, Calendar.getInstance(), 4000, TipoConta.ESPECIAL));

        for (ContaCorrente cc: lista) {
            System.out.println(cc.getSaldo());

        }

    }
}
