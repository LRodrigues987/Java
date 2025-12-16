package Básico;

public class ServicoMensagem{
    private final Notificador notificador;

    public ServicoMensagem(Notificador notificador){
        this.notificador = notificador;
    }

    public void notificarCliente(String cliente, String texto){
        this.notificador.enviar(cliente, texto);
    }

}