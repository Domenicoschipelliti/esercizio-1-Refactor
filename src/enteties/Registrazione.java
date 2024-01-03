package enteties;

public class Registrazione extends ElementoMultimediale{

    private int volume;

   public  int alzaVolume(){
      return volume=volume+1;
   }

   public  int abbassaVolume(){
       return volume=volume-1;
   }

   public Registrazione(String titolo, int durata, int volume) {
      super(titolo, durata);
      this.volume = volume;
   }

   public String  Ripetizione(){
      for ( int i=0; i < getDurata(); i++){
         System.out.println(getTitolo());
         System.out.println("Volume:");
         for (int j=0;j<volume;j++){
           System.out.println("!");
         }

      }


      return getTitolo();
   }

   public int getVolume() {
      return volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   @Override
   public String toString() {
      return "Registrazione{" +
              "volume=" + volume +
              '}';
   }
}
