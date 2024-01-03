package enteties;

public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;




    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }


    public ElementoMultimediale(){

    }


    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }
}
