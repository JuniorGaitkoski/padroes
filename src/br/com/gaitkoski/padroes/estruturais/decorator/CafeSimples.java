package br.com.gaitkoski.padroes.estruturais.decorator;

public class CafeSimples implements Cafe{

    @Override
    public String getDescricao() {
        return "Cafe simples";
    }

    @Override
    public double getCusto() {
        return 14.99;
    }

}
