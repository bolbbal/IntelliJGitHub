package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] subjects = {"국어", "영어", "수학"};
        System.out.print("학생수를 입력하세요: ");
        int student = scanner.nextInt();
        int[][] score = new int[student][subjects.length];

        for (int row = 0; row < score.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < score[row].length; column++) {
                System.out.print(subjects[column] + " 점수: ");
                score[row][column] = scanner.nextInt();
            }
        }

        int totalScore = 0;
        for (int row = 0; row < score.length; row++) {
            for (int column = 0; column < score[row].length; column++) {
                totalScore += score[row][column];
            }
            double average = (double) totalScore / 3;
            System.out.println((row+1) + "번 학생의 총점: " + totalScore + ", 평균: " + average);
            totalScore = 0;
        }
        /*풀이
        for(int i=0; i<4; i++){
            int total = 0;
            for(int j=0; j<3; j++){
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }

         */
    }
}
/*
이전 문제에서 학생수를 입력받도록 개선하자.
실행 결과 예시를 참고하자.
 */