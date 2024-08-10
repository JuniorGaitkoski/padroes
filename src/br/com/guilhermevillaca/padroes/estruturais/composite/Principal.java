package br.com.guilhermevillaca.padroes.estruturais.composite;

public class Principal {

    public static void main(String[] args) {
        Empregado funcionario1 = new Funcionario ("Junior", "Dev");
        Empregado funcionario2 = new Funcionario ("Bendo", "Acompanhante de luxo");
        
        Gestor gestor1 = new Gestor ("Erico", "Coordenador");
        gestor1.adicionarSubordinado (funcionario1);
        gestor1.adicionarSubordinado (funcionario2);
        
        Empregado funcionario3 = new Funcionario("Marta", "Capita do Brasil");
        
        Gestor diretor = new Gestor ("Eduardo", "CEO de Tecnologia");
        diretor.adicionarSubordinado(funcionario3);
        diretor.adicionarSubordinado(gestor1);
        
        System.out.println("Detalhes da estrutura da empresa");
        diretor.mostrarDetalhes();
    }
    
}
