package Projetos;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudArrayList {


    ArrayList<String> nomes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adicionar(){
        System.out.println("Insira um nome: ");
        nomes.add(scanner.next());


    }

    public void mostrar(){
        for (int i = 0; i < nomes.size(); i++){
            System.out.println( i + " " + nomes.get(i));
        }


    }

    public void apagar(){
        mostrar();
        System.out.println("Qual nome deseja apagar?");
        nomes.remove(scanner.next());
    }

    public void alterar(){

        String nomeVelho;
        String nomeNovo;
        int indice;

        if (nomes.isEmpty()){
            System.out.println("A lista está vazia.");
            return ;

        }else{

            mostrar();

            System.out.println("Qual nome deseja altera?");
            nomeVelho = scanner.nextLine();


            indice = nomes.indexOf(nomeVelho);

            if(indice != -1){
                System.out.println("Para qual nome ele será mudado?");
                nomeNovo = scanner.nextLine();
                nomes.set(indice, nomeNovo);

            } else {
                System.out.println("O nome não foi encontrado");
            }




        }




    }


}
