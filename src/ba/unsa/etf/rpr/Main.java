package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: \n");
        for (int i = 1; i <=n; i++)
        {
            if (i%sumaCifara(i)==0)
                System.out.println(i + "\n");
        }
    }

    private static int sumaCifara(int i) {
        int suma = 0;
        while (i>0)
        {
            suma = suma + (i%10);
            i = i/10;
        }
        return suma;
    }

}
