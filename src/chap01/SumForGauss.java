package chap01;

import java.util.Scanner;

public class SumForGauss {
    static int gaussSum(int n){
        int result = (1+n) * n / 2;

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n의 값을 입력하세요 : ");
        int n = stdIn.nextInt();

        System.out.print("1부터 n까지의 합은 : " + gaussSum(n));
    }
}
