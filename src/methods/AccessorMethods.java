package methods;

public class AccessorMethods {

    public static void main(String[] args) {
        Auto golf = new Auto("Golf",2010,8000.0);
        System.out.println("Atuto "+ golf.naziv + " godista "+golf.godiste+" kosta "+golf.cena+ " i njegova brzina je " + golf.getBrzina());
    }


}
class Auto{

     String naziv;
    int godiste;
     double cena;

     private int brzina = 250;

    public Auto(String naziv, int godiste, double cena) {
        this.naziv = naziv;
        this.godiste = godiste;
        this.cena = cena;
    }

    public int getBrzina(){
        return brzina;
    }

}