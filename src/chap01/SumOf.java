package chap01;

import java.util.Scanner;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드
public class SumOf {
    static int sumOf(int a, int b) {
        int min = a;
        int max = b;
        int sum = 0;
        if (b < a) {
            min = b;
            max = a;
        } else if (a == b) {
            return 2*a;
        }
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a, b 값을 입력해주세요 : ");
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        System.out.println("a부터 b까지의 합은 : " + sumOf(a, b));
    }
}
