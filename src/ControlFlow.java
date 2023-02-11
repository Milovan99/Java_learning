public class ControlFlow {

    public static void main(String[] args) {
     //   IfStatment ucenik = new IfStatment(82,"Milovan");
     //   ucenik.rezultat();

     //   WhileStatment brojac = new WhileStatment(5);
     //   brojac.izbroj();

     //   DoWhileStatment brojac = new DoWhileStatment(0);
     //   brojac.izbroj();

     //   ForStatment parniBrojevi = new ForStatment(11);
     //   parniBrojevi.izbrojParneBrojeve();

     //   int[] brojevi={3,5,4,2,7,10,60,81};
     //   ForWithArrays kolekcija = new ForWithArrays(brojevi);
     //   kolekcija.prikaziParneBrojeve();
        //
     //   BreakStatment pronadjiIndeks = new BreakStatment(brojevi,3);
     //   pronadjiIndeks.pronadjiIndeks();

     //   int [][] niz2D= {{1,8,56,23,45,7},{45,878,12,4,9},{777,264,7369}};
     //   LabeledBeakeStatment pronadjiIndeksU2DNizu= new LabeledBeakeStatment(niz2D,9);
     //   pronadjiIndeksU2DNizu.pronadjiIndeks();

      //  ContntinueFor slovaURecenici = new ContntinueFor("Ovo je random tekst",'t');
      //  slovaURecenici.kolikoSlovaImaURecenici();

        Switch danUNedelji=new Switch(7);
        danUNedelji.daniUSedmici();
    }
}

class IfStatment{

    String ime;
    int bodovi;
    IfStatment(int bodovi,String ime){
        this.bodovi=bodovi;
        this.ime=ime;
    }
   private int ocena(){
        if (bodovi >= 91 && bodovi <= 100){
          return 10;
        } else if (bodovi >=81 && bodovi<=90) {
            return 9;
        } else if (bodovi >=71 && bodovi<=80) {
            return 8;
        } else if (bodovi >=61 && bodovi<=70) {
            return 7;
        }else if(bodovi >=51 && bodovi<=60){
            return 6;
        }else{
            return 5;
        }
    }

    void rezultat(){
        System.out.println("Ucenik "+ime+" dobio je ocenu "+ocena());
        System.out.println((ocena()>5)?"Prolaz":"Nije prolaz");
    }

}

class WhileStatment{
    int brojac;
    WhileStatment(int brojac){
        this.brojac=brojac;
    }

    void izbroj(){
        while(brojac>0){
            System.out.println(brojac);
            brojac--;
        }
    }
}

class DoWhileStatment{

    int brojac;

    DoWhileStatment(int brojac){
        this.brojac=brojac;
    }

    void izbroj(){
        do{
            System.out.println(brojac);
            brojac--;
        }while (brojac>0);
    }
}

class ForStatment{
    int brojac;

    ForStatment(int brojac){
        this.brojac=brojac;
    }

    void izbrojParneBrojeve(){
        for (int i = 2 ; i <= brojac ; i+=2){
            System.out.println(i);
        }
    }
}

class ForWithArrays {

    int[] kolekcija;

    ForWithArrays(int[] kolekcija){
        this.kolekcija=kolekcija;
    }

    void prikaziParneBrojeve(){
        for (int item :kolekcija){
            if(item % 2 == 0){
                System.out.println(item);
            }
        }
    }
}

class BreakStatment{

    int [] kolekcija ;
    int broj;
    boolean postojanje = false;

    BreakStatment(int[] kolekcija,int broj){
        this.kolekcija=kolekcija;
        this.broj=broj;
    }

    void pronadjiIndeks(){
        for(int i = 0 ; i < kolekcija.length;i++){
            if(kolekcija[i]==broj){
                System.out.println("Indeks broja "+broj+" je "+i );
                postojanje=true;
                break;
            }
        }
        if (!postojanje){
            System.out.println("Broj se ne nalazi u ovoj kolekciji");
        }
    }
}


class LabeledBeakeStatment{
    int [][] kolekcija ;
    int broj;
    boolean postojanje = false;

    LabeledBeakeStatment(int[][] kolekcija,int broj){
        this.kolekcija=kolekcija;
        this.broj=broj;
    }

    void pronadjiIndeks(){
        pretraga:
        for(int l = 0 ; l < kolekcija.length;l++) {
            for (int i = 0; i < kolekcija[l].length; i++) {
                if (kolekcija[l][i] == broj) {
                    System.out.println("Indeks broja " + broj + " je " + i + " u nizu " + (l+1));
                    postojanje = true;
                    break pretraga;
                }
            }
        }
        if (!postojanje){
            System.out.println("Broj se ne nalazi u ovoj kolekciji");
        }
    }


}

class ContntinueFor{
    String tekst;
    char slovo;

    ContntinueFor(String tekst,char slovo){
        this.tekst=tekst;
        this.slovo=slovo;
    }

    void kolikoSlovaImaURecenici(){
        int brojac=0;
        for(int i=0;i<tekst.length();i++){
            if(tekst.charAt(i)!=slovo){
                continue;
            }
            brojac++;
        }
        System.out.println("Slova "+slovo+" ima "+brojac+" puta u recenici");
    }
}

class Switch{
    int dan;

    Switch(int dan){
        this.dan=dan;
    }

    void daniUSedmici(){
        switch (dan) {
            case 1 -> System.out.println("Ponedeljak");
            case 2 -> System.out.println("Utorak");
            case 3 -> System.out.println("Sreda");
            case 4 -> System.out.println("Cetvrtak");
            case 5 -> System.out.println("Petak");
            case 6 -> System.out.println("Subota");
            case 7 -> System.out.println("Nedelja");
            default -> System.out.println("Nepostojeca vrednost");
        }
    }
}