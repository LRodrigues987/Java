package Básico;
import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Base {
    public void base(){
        //Impressão básica no console

//        System.out.println("Hello world \n");
//        System.out.println("I like pizza");


        //Variaveis primitivas são armazenadas diretamente na memória
        //variaveis referencias apontam para o local na memória
        //Primitivas = int double char boolean
        //Referencias = String array object

        //Bollean com if

//        boolean isAlive = false;
//        if (isAlive){
//            System.out.println("Tá vivo ainda ");
//        }else{
//            System.out.println("Não tá mais");
//        }

        // Interação com o usuário
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Qual seu pokemon favorito?");
//        String pokemon = scanner.next();
//
//        System.out.println(pokemon);

        // Calculando a área de um retangulo
//        System.out.println("Qual a altura?  ");
//        Double height = scanner.nextDouble();
//        System.out.println("Qual a largura? ");
//        Double width = scanner.nextDouble();
//
//        Double area = height * width;
//        System.out.println("A area do retangulo é: "+area);
//
//        scanner.close();

        //Números aleatórios

    }

    public void random(){
        Random random = new Random();

        int number = random.nextInt(1,20);
        System.out.println(number);

        double numeroDouble = random.nextDouble(1,7);
        System.out.println(numeroDouble);

        Boolean ativo = random.nextBoolean();
        System.out.println( ativo);

    }

    public void chamarMath(){
        // a classe math possui algumas constantes que podem ser úteis para operações matemáticas

        double resultado = Math.pow(2, 6 ); // potenciação
        double raiz = Math.sqrt(4); // Raiz quadrada

    }

    void iniciarPrint(){
        // Uma alternativa ao printline.

        String nome = "Lalala";
        System.out.printf("Seu nome é %s", nome);

    }
    public void iniciarTernario(){
        //è utilizado para simplificar estruturas condicionais
        // variavel = condição ? saida verdadeira : saida falsa

        int nota = 22;

        String passou = (nota > 70) ? " Passou" : " Não passou";
        System.out.println(passou);
    }

    public void manipularArray(){
        //criando array imutável
        String[] array = new String[5];

        //Inserindo valor ao array imutavel
        array[0] = "essa é a posição 0 do array";



        //Imprimindo os valores do array
        System.out.println(array[0]);
        System.out.println(array.length);

        //copiando array imutável
        String[] novoArray =  Arrays.copyOf(array, 10); //copia para um array de 10 posições

        //Perconrrendo o array imutável

        for (int i = 0; i < novoArray.length ; i++){
            System.out.println(novoArray[i]);
        }





    }

    public void iniciarArrayList(){
        //Criação
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> alturas = new ArrayList<>();

        //inserindo no array
        nomes.add("Tokino Sora");
        alturas.add(156);

        //Acessando o dade
        System.out.println(nomes.get(0));
        System.out.println(alturas.get(0));

        //Número de elementos
        System.out.println(nomes.size());
        System.out.println(alturas.size());

        //Alterando
        nomes.set(0, "Shirogane Noel");

        //Apagando
        nomes.remove(0);

        nomes.stream().forEach(idol -> System.out.println(idol));


        // COm for each
        for (String idol : nomes){
            System.out.println(idol);
        }
        // Uma forma simplificada e moderna
        nomes.stream().forEach(idol -> System.out.println(idol));


    }

}
