package chap01;

import java.util.Scanner;

public class Min3 {
    //    세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = min3(a, b, c);
        System.out.println("최솟값은 " + min);
    }
}
