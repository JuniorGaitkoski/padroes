package br.com.gaitkoski.padroes.estruturais.decorator;

public class Principal {

    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        meuCafe = new Leite (meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
        
        meuCafe = new Acucar (meuCafe);
        System.out.println(meuCafe.getDescricao() + " custa " + meuCafe.getCusto());
    }
    
}
