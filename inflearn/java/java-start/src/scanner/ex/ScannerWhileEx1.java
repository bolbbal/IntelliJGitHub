package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();
            System.out.println();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            System.out.println();
            //scanner.nextLine();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
        /*
        처음 실행땐 정상적으로 되는데 반복될 땐
        이름을 입력하세요 (종료를 입력하면 종료): << 이거부터 뜨는게 아니라
        이름을 입력하세요 (종료를 입력하면 종료):    <<
        나이를 입력하세요:                        <<위 두 줄이 한번에 뜨고 문자열 입력하면 바로 20번 줄에서 컴파일 오류

        줄 바꿀 때 21번 라인의
        System.out.println(); 대신
        scanner.nextLine(); 을 사용하니 정상적으로 작동됐음
         */
    }
}
/*
사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요. 사용
자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
다음 실행 결과 예시를 참고해주세요.
 */