public class Operators {
    public static void main(String[] args){

        //Assigment operator
        String ime="Milovan";
        String prezime="Jakovljevic";
        String imeIPrezime = ime+" "+prezime;
        int godinaRodjenja = 1998;
        int trenutnaGodina=2023;
        int minuta=120;
        int broj=5;
        int negativanBroj=-5;
        boolean zavrsenFakultet=true;

        //Aritmetic operators
        godinaRodjenja+=1;
        int godine = trenutnaGodina-godinaRodjenja;
        int sledecaKalendarskaGodina=trenutnaGodina+1;
        int meseciZivota=godine*12;
        int satiUMinutu=minuta/60;
        int paranBroj = 120 %2;
        //Unary operators
        //broj=5
        broj++;
        //output broj=6
        broj--;
        //output broj=6
       System.out.println(!zavrsenFakultet);
        System.out.println(-broj);
        System.out.println(-negativanBroj);



    }
}


