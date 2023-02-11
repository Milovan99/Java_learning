package methods;

import java.util.Scanner;

public class PredefinedMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite prv broj");
        int a = input.nextInt();

        System.out.println("Unesite drugi broj");
        int b = input.nextInt();

        System.out.println("Veci broj je " + veciBroj(a,b));
    }
    private static int veciBroj(int a,int b){
        return Math.max(a,b);
    }
}
