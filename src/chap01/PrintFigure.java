package chap01;

import java.util.Scanner;

public class PrintFigure {
    static int printFigure(int a) {
        int ten = 10;
        int cnt = 1;
        while (a / 10 > 0) {
            a = a/10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("양의 정수 a 의 값을 입력해주세요 : ");
            a = sc.nextInt();
        } while (a <= 0);
        System.out.println("a의 자릿수는 " + printFigure(a) + " 입니다.");
    }
}
