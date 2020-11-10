package question4;

import java.util.Scanner;

import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("lutfen yuvarlama yapilacak sayiyi giriniz");
        float sayi = sc.nextFloat();
        System.out.println("Yukari yuvarlamak için 1, asagi yuvarlamak icin 2'ye basiniz");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println(ceil(sayi));
                break;
            case 2:
                System.out.println(floor(sayi));
                break;
            default:
                System.out.println("Yanlis girdiniz. Lutfen 1 ya da 2'ye basiniz!");
        }

    }
}
