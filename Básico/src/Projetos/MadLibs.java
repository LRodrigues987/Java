package Projetos;
import java.util.Scanner;
public class MadLibs {
    public void iniciar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ");
        String palavra1 = scanner.next();
        System.out.println("Digite outra palavra ");
        String palavra2 = scanner.next();
        System.out.println("Digite umaa ultima palavra ");
        String palavra3 = scanner.next();

        System.out.println("Once upon a " + palavra1 + " ,In a " + palavra2 + " the " + palavra3 + " has been born" );


    }
}
