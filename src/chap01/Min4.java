package chap01;

import java.util.Scanner;

public class Min4 {
    //    네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = min4(a, b, c, d);
        System.out.println("최솟값은 " + min);
    }
}
