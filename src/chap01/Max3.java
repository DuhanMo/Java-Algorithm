package chap01;

import java.util.Scanner;

// 3개의 값중 최댓값을 변수 max 로 찾을 수 있습니다.
public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.print("c의 값 : "); int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
