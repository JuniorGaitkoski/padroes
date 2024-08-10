package br.com.gaitkoski.padroes.estruturais.composite;

public class Funcionario implements Empregado{

    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    @Override
    public void mostrarDetalhes() {
        System.out.println(nome + " - " + cargo);
    }

}
