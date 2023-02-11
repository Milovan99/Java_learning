package methods;

import java.util.Scanner;

public class UserDefinedMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj godina");
        int godine = input.nextInt();

        if ((korisnikPunoljetan(godine))) {
            System.out.println("Punoljetan");
        } else {
            System.out.println("Nije punoljetan");
        }
    }

    private static boolean korisnikPunoljetan(int godine){
        return godine >= 18;
    }
}
