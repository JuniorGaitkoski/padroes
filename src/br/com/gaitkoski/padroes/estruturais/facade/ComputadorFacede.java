package br.com.gaitkoski.padroes.estruturais.facade;

public class ComputadorFacede {
    
    private Memoria memoria;
    private Dispositivo dispositivo;
    private SistemaOperacional sistemaOperacional;

    public ComputadorFacede() {
        this.memoria = new Memoria();
        this.dispositivo = new Dispositivo();
        this.sistemaOperacional = new SistemaOperacional();
    }
    
    public void IniciarComputador(){
        System.out.println("Iniciando computador...");
        memoria.VerificarMemoria();
        dispositivo.IniciarDispositivo();
        sistemaOperacional.CarregandoSistemaOperacional();
        System.out.println("Computador iniciado com sucesso!");
    }
        
    
}
