package Básico;
import java.util.InputMismatchException;
import java.util.Scanner;


// exceção imterrompo o ilo padrão do programa
public class Tratamento {

    public void iniciarTratamento(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite um número ");
            int numero = scanner.nextInt();

        }
        catch (ArithmeticException e) {
            System.out.println("Não é um número");

        }
        catch (InputMismatchException e) {  //Pode ter vários catchs
            System.out.println("Não é um número");
        }
        catch (Exception e) {  //Pode ter vários catchs
            System.out.println("Algo oorreu");
        }
        finally {
            //Será chcamado no final independente de ter pego um erro ou nao
            //Usado para chechar arquivos
            scanner.close();

        }

    }


}

