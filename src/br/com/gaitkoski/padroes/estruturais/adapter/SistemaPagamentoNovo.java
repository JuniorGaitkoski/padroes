package br.com.gaitkoski.padroes.estruturais.adapter;

public interface SistemaPagamentoNovo {

    void processarPagamento(String clienteId, double valor);
}
