package enteties;

public class Video extends ElementoMultimediale{
    private int luminosita;
    private int videoAudio;

    public  int alzaVolume(){
        return videoAudio=videoAudio+1;
    }

    public  int abbassaVolume(){
        return videoAudio=videoAudio-1;
    }


    public int aumentaLuminosita(){
        return luminosita=luminosita+1;

    }

    public int diminuisciLuminosita(){
        return luminosita=luminosita-1;

    }


    public Video(String titolo, int durata, int luminosita, int videoAudio) {
        super(titolo, durata);
        this.luminosita = luminosita;
        this.videoAudio = videoAudio;
    }

    public String registrazioneVideo(){
        for (int i=0;i<getDurata();i++){
            System.out.println(getTitolo());

        }
        System.out.println("Volume:");
        for (int j=0;j<videoAudio;j++){
            System.out.println("!");
        }
        System.out.println("Luminosità:");
        for (int h=0;h<luminosita;h++){
            System.out.println("*");
        }
        return getTitolo();
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVideoAudio() {
        return videoAudio;
    }

    public void setVideoAudio(int videoAudio) {
        this.videoAudio = videoAudio;
    }





    @Override
    public String toString() {
        return "Video{" +
                "luminosita=" + luminosita +
                ", videoAudio=" + videoAudio +
                '}';
    }
}
