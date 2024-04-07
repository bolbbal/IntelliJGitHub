package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
        int min, max;
        min = max = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
/*
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
그램을 작성하자. 실행 결과 예시를 참고하자
 */