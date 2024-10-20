package structure;

import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        // 5개 정수 받기
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        // 가장 큰수 찾기
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max){
                max = num;
            }
        }
        System.out.println("가장 큰수: " + max);

    }
}
