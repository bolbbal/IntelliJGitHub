package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage(3);
        printMessage(5);
        printMessage(7);
    }

    public static void printMessage(int count) {
        String message = "Hello, world";
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
    /*풀이
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

     */
}
/*
다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
메서드를 사용해서 리펙토링해보자.
public static void main(String[] args) {
 String message = "Hello, world!";
 for (int i = 0; i < 3; i++) {
 System.out.println(message);
 }
 for (int i = 0; i < 5; i++) {
 System.out.println(message);
 }
 for (int i = 0; i < 7; i++) {
 System.out.println(message);
 }
 }
 */