package br.com.gaitkoski.padroes.estruturais.decorator;

public class Acucar extends CafeDecorator{
    
    public Acucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto(){
        return cafe.getCusto() + 2.99;
    }
    
    @Override
    public String getDescricao() {
        return cafe.getDescricao() + "com acucar";
    }
    
}
