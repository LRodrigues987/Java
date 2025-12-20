package Básico;

import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivos {

    public void iniciar(){
        String arquivo = "./files/arquivo_teste.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo));){
            String linha;
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);

            }
            System.out.println("");
        } catch (FilerException e) {
            System.out.println("Occoreu um erro " + e);
        } catch (IOException e){
            System.out.println("Algo deu errado");
        }



    }
}


// Usar o BurreredReader = FileReader para arquivos de texto
// Usar o FileImputStream paraarquivos binary - imagens audio etc

//Exemlpos de BinaryFiles
//Imagens: .png, .jpg
//Vídeos: .mp4
//Áudios: .mp3
//xecutáveis: .exe, .jar
//PDFs: .pdf
//Arquivos compactados: .zip

//RandomAccessDFile Melhor para leitura e eescrita e pedaços de arquivos grander
