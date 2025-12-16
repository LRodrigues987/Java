package Básico;
public class EmailNotificador implements Notificador{
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Email enviado para " + destino);
        System.out.println("Messagem: " + mensagem);
    }
}