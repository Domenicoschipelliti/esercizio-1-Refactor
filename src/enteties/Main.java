package enteties;

import enteties.Immagine;
import enteties.Registrazione;
import enteties.Video;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cosa vuoi ascoltare un file riproducibile oppure mostrare un immagine");
        String utente=scanner.nextLine();

        if (utente.equals("riproducibile")){
           System.out.println("ok un video o una registrazione?");
          String ute1= scanner.nextLine();
           if (ute1.equals("video")){
              Video video=new Video("il video",23,40,50);
              video.registrazioneVideo();
           }
           if (ute1.equals("registrazione")){
               Registrazione registrazione=new Registrazione("wario e le sue avventure",21,20);
               registrazione.Ripetizione();
           }
        }
        if (utente.equals("immagine")){
            Immagine immagine=new Immagine("Castelli di sabbia",2,20);
            immagine.show();
        }





    }
}
