package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //일단 while문으로 무한반복 시키고 if문으로 메뉴 선택, else문으로 메뉴에 없는 숫자 입력 시에만 나오는 문구를 설정했는데
        // break 들어간 부분 빼고는 다 else문에 사용한 문구가 떠서 뭐가 잘못된지 모르겠어서 풀이봤음
        // 정상작동되면 그때 method 쓰려고 했는데 아쉬운 문제

        int balance = 0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int plus = scanner.nextInt();
                balance += plus;
                System.out.println(plus + "원을 입금하였습니다. 현재 잔액: " + balance);
            }
            if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int minus = scanner.nextInt();
                if (minus > balance) {
                    System.out.println(minus + "원을 출금하려 했으나 잔액이 부족합니다.");
                    continue;
                }
                balance -= minus;
                System.out.println(minus + "원을 출금하였습니다. 현재 잔액: " + balance);
            }
            if (choice == 3) {
                System.out.println("현재 잔액: " + balance);
            }
            if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }
        }
    }
}
/*
다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다
 */