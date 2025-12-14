package Projetos;

import java.util.Scanner;

public class Conversor {
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);




        System.out.println("Conversor de unidades");

        System.out.println("Escolha 1 para converter de libras para quilos");
        System.out.println("Escollha 2 para converter de quilos para libras");
        int escolha = scanner.nextInt();

         if(escolha == 1){
             System.out.println("Digite o valor em quilos");
             double peso = scanner.nextDouble();
             double novopeso = peso * 2.20462;
             System.out.printf("correspondem a %f Libras", novopeso);

         } else if (escolha == 1) {
             System.out.println("Digite o valor em quilos");
             double peso = scanner.nextDouble();
             double novopeso = peso * 0.453592;
             System.out.printf("Correspondem a %f quilos", novopeso);
         }else{
             System.out.println("O numero informado não está associado a nenhuma operação");
         }


        scanner.close();
    }
}
