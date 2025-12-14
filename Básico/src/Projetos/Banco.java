package Projetos;

import java.util.Scanner;

public class Banco {
    Scanner scanner = new Scanner(System.in);
    protected double balance;
    private Boolean isRunning = true;
    private int choice;

    public void iniciar() {


        while (isRunning) {
            System.out.println("Conta bancária fic");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("Qual operação deseja fazer?");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("4 - Sair do programa");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> depositar();
                case 2 -> sacar();
                case 3 -> mostrar();
                case 4 -> isRunning = false;

            }
        }


    }

    protected void mostrar() {
        if (balance == 0) {
            System.out.println("Não hpa saldo");
            return;
        }
        System.out.println("R$" + balance);
    }

    protected void depositar() {
        double entrada;
        System.out.println("Qual valor deseja depositar?");
        entrada = scanner.nextDouble();
        scanner.nextLine();
        if (entrada < 0) {
            System.out.println("O valor informado não é válido");
            return;
        }
        balance = balance + entrada;
        System.out.println("A quantia de " + entrada + "fpo depositada");
    }

    protected void sacar(){
        double entrada;
        System.out.println("Qual o valor que deseja retira:");
        entrada = scanner.nextDouble();
        scanner.nextLine();

        if (entrada < 0 || entrada > balance){
            System.out.println("O valor não pode ser sacado");
            System.out.println("O seu salfo é:" + balance);
            return;
        }

        balance = balance - entrada;
        System.out.println("Voce sacou " + entrada);
    }


}