package br.com.guilhermevillaca.padroes.estruturais.bridge;

public class Principal {

    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);
        
        System.out.println("Usando controle basico");
        controleBasico.ligarDesligar();
        controleBasico.aumentarVolume();
        controleBasico.diminuirVolume();
        controleBasico.ligarDesligar();
        
        Dispositivo radio = new Radio();
        ControleRemoto controleAvancado = new ControleRemotoAvancado(radio);
        System.out.println("Usando controle avancado");
        controleAvancado.ligarDesligar();
        controleAvancado.aumentarVolume();
        controleAvancado.diminuirVolume();
        controleAvancado.silenciar();
        controleAvancado.ligarDesligar();
    }
    
}
