package Básico;

import java.util.Scanner;

public class Arrays {

    public void introArrays(){
        String[] array = {"item 6 ", "item 2", "item 3"};
        int tamanhoArray = array.length;
        System.out.println(tamanhoArray);



        // Percorrendo array
        for(String item : array){  //isso é um enhanced For Loop
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        for( int i = 0 ; i < nomes.length; i++ ){
            System.out.println("Insira um nome: ");
            nomes[i] = scanner.nextLine();
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

    }

    public void buscaArray(){
        int[] numerosArray  = {1,2,3,4,5,6,7,8,9,0};
        int target = 7;
        boolean isTrue = false;

        for( int i = 0 ; i < numerosArray.length ; i++ ){
            if (target == numerosArray[i]){
                System.out.println("Numero encontrado na posiçao " + i);
                isTrue = true;
                break;

            }
        }

    }

    public void varargsIniciar(int... numeros){
        // permie um mpetoido aceitar diversos valores
        int soma = 0;

        for(int numero : numeros){
            soma += numero;
        }
        System.out.println(soma / numeros.length);

    }

    public void array2D(){
        // array onde ada elemento e um array
        char[][] telefone ={{'1','2', '3'},
                            {'4', '5', '6'},
                            {'7', '8', '9'},
                            {'*', '0', '#'}
        };

        for(char[] linha : telefone){
            for(char caracteres : linha){
                System.out.print(caracteres + " ");
            }
            System.out.println();
        }
    }
}
