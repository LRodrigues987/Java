import Básico.*;
import Básico.Notificador;
import Básico.EmailNotificador;
import Básico.ServicoMensagem;
import Projetos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Banco banco = new Banco();
        

//      //Base de Java
            Base base = new Base();

            Arrays arrays = new Arrays();
//            CrudArrayList crud = new CrudArrayList();
//
//
//        // Chamada de projetos
//
//        //Conversor de unidades
////            Conversor conversor = new Conversor();
////            conversor.iniciar();
//
//        //Crud com ArrayList
//        while (true){
//            System.out.println("Bem vindo ao Crud mais simples da história /n/n");
//
//            System.out.println("Qual operação gostaria de fazer?");
//            System.out.println("1 - Adicionar \n" +
//                    "2 - Alterar \n" +
//                    "3 - Mostrar \n" +
//                    "4 - Apagar \n" +
//                    "5 - Sair \n");
//            String escolha = scanner.nextLine();
//
//            escolha.toLowerCase();
//
//            if (escolha.equals("1") || escolha.equals("mostrar")){
//                crud.adicionar();
//
//            } else if (escolha.equals("2") || escolha.equals("alterar") ) {
//                crud.alterar();
//
//            } else if (escolha.equals("3") || escolha.equals("mostrar") ){
//                crud.mostrar();
//            } else if (escolha.equals("2") || escolha.equals("alterar") ){
//                crud.apagar();
//            } else if (escolha.equals("5") || escolha.equals("sair")){
//                break;
//            }else {
//                System.out.println("A opção informada não existe");
//            }
//        }



    // Manipulando Arrays
//        base.iniciarArrayList();



    //Banco
//        banco.iniciar();
    //Arrays
//        arrays.buscaArray();
//        arrays.varargsIniciar(1,2,3,4,5,6,7,8,9);
//          arrays.array2D();

//Try Catch
//        Tratamento tratamento = new Tratamento();
//        tratamento.iniciarTratamento();


        //OOp

//        Notificador notif = new EmailNotificador();
//        ServicoMensagem servicoMensagem = new ServicoMensagem(notif);
//
//        servicoMensagem.notificarCliente("Joao@lol.com", "Essa é uma mesagem teste");
//

        //Lendo arquivos

//        LendoArquivos lendoArquivos = new LendoArquivos();
//
//        lendoArquivos.iniciar();

        //Music PLayer

        AudioPLayer player = new AudioPLayer();

        player.MusicPlayer();






    }
}
