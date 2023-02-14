import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int godine = 23;
        String ime = "Milovan";
        float prosecnaOcena = 7.85f;
        double brojPi = 3.141592653589793;
        char krvaGrupa='O';
        byte brojPtijatelja =8;
        long velikiRandomBroj = 1554646848673125455L;
        boolean zavrsenFakultet=true;

        System.out.println("Moje ime je "+ime);
        System.out.println("Imam "+godine+" godine");

        if(zavrsenFakultet){
            System.out.println("Zavrsio sam fakultet");
        }else{
            System.out.println("Nisam zavrsio fakultet");
        }

        System.out.println("Prosecna ocena na fakultetu "+prosecnaOcena);
        System.out.println("Krvna grupa "+krvaGrupa );
        System.out.println("Broj PI :"+brojPi);
        System.out.println("Imam "+brojPtijatelja+" bliskih prijatelja");
        System.out.println("I za kraj random broj: "+velikiRandomBroj);
    }
}