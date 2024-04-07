package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
