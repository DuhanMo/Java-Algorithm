package chap01;

import java.util.Scanner;

public class SumForPrintN {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i == n) {
                System.out.print(i + " = ");
                break;
            }
            System.out.print(i + " + ");
        }
        System.out.print(sum);
    }
}
