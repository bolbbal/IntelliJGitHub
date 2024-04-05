package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;  //5
        a += 3;     //8 (5 + 3)
        System.out.println("a = " + a);
        a -= 2;     //6 (8 - 2)
        System.out.println("a = " + a);
        a *= 4;     //24 (6 * 4)
        System.out.println("a = " + a);
        a /= 3;     //8 (24 / 3)
        System.out.println("a = " + a);
        a %= 5;     //3 (8 % 5)
        System.out.println("a = " + a);
    }
}
