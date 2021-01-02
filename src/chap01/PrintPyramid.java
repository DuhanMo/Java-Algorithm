package chap01;

import java.util.Scanner;

public class PrintPyramid {
    static void spira(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수를 입려하세요 : ");
        int n = sc.nextInt();
        spira(n);
    }
}
