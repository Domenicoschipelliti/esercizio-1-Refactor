package enteties;

public class Immagine extends ElementoMultimediale{
    int luminosita;


    public Immagine(String titolo, int durata, int luminosita) {
        super(titolo, durata);
        this.luminosita = luminosita;
    }

    public int aumentaLuminositaImmagine(){
        return luminosita=luminosita+1;

    }

    public int diminuisciLuminositaImmagine(){
        return luminosita=luminosita-1;

    }


    public String show(){
        for (int i=0;i<getDurata();i++){
            System.out.println(getTitolo());
            System.out.println("-**/IMMAGINE.png/**-");

        }
        System.out.println("Luminosità:");
        for (int h=0;h<luminosita;h++){
            System.out.println("*");
        }
        return getTitolo();
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                '}';
    }
}
