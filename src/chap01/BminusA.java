package chap01;

import java.util.Scanner;

public class BminusA {
    static int bma(int a, int b){

        return b-a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("a의 값 : ");
            a = sc.nextInt();
            System.out.print("b의 값 : ");
            b = sc.nextInt();
        } while (b <= a);

        System.out.println("b - a 의 값은 : " + bma(a, b));
    }
}
