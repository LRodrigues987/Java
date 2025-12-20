package Projetos;

// Esse é um protótipo de um musicPlayer com o básico de leitura de arquivos de audio
//As músicas usadas viedas do seguinte link
//https://studio.youtube.com/channel/UCXzh325lv4v-HVqug4ZqXCg/music

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.Clip;

// os arquivbos utiliados serao wav
// Para ler mpo3 será necessário uma library diferente
public class AudioPLayer {

    public void MusicPlayer(){
        String arquivo = "./files/Twinkle-The-Grey-Room-_-Density-_-Time.wav";
        File file = new File(arquivo);


        try( AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
             Scanner scanner = new Scanner(System.in)){


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("**** Audio player ****");
            System.out.println("Digite P para dar PLay");
            System.out.println("Digite S para dar Stop");
            System.out.println("Digite R para voltar ao inicio da musica");
            System.out.println("Digite Q para dar Sair do programa");
            String resposta = "";


            while (!resposta.equals("Q")){
                resposta = scanner.next().toUpperCase();
                switch(resposta){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Operaçao inválida");
                }

            }



        }

        catch (UnsupportedAudioFileException e){
            System.out.println("Arquivo de audio nao é .wav");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio nao disponivel");
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado");
        }

        catch (IOException e) {
            System.out.println("Algo deu errado ");
        }

}
}
