// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Java döngüler ile fibonacci serisi bulan program yazıyoruz.
            Fibonacci serisinin eleman sayısını kullanıcıdan alın.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisi Kaç Elemanlı Olsun : ");
        int fibo = input.nextInt();

        int x = 0;
        int y = 1;
        int z;
        System.out.println(fibo + " Elemanlı Fibonacci Serisi :");
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < fibo; i++) {
            z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }

    }
}