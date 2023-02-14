package datastructure;

public class TheArray {

    public static void main(String[] args) {
        int[] arr= new int[5];
        int[] arr2={1,2,3,4,5};
        System.out.println(zadnjiClan(arr2));
        System.out.println(pronadjiClan(4,arr));
        //dynamic array

    }

    static int zadnjiClan(int[] niz){
       return niz[niz.length-1];
    }

    static boolean pronadjiClan(int clan,int[] niz){
        for (int el:niz){
            if(el==clan){
                return true;

            }
        }
        return false;
    }
}
