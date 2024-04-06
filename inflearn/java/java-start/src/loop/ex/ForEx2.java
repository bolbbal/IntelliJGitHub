package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num = num + 2;
        }
        /*
        풀이
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
        강사님은 내가 적은 코드가 더 깔끔하다고 생각한다 말하심
         */
    }
}
/*
반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num 이라는 변수를 사용하여 수를
표현해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */