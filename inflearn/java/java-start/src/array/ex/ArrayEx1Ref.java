package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50};

        int total = students[0] + students[1] + students[2] + students[3] + students[4];
        /* 풀이
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }*/

        double average = (double) total / 5;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
/*
다음 문제를 배열을 사용해서 개선하자.
```java
package array.ex;
public class ArrayEx1 {
 public static void main(String[] args) {
 int student1 = 90;
 int student2 = 80;
 int student3 = 70;
 int student4 = 60;
 int student5 = 50;
 int total = student1 + student2 + student3 + student4 + student5;
 double average = (double) total / 5;
 System.out.println("점수 총합: " + total);
 System.out.println("점수 평균: " + average);
 }
}
 */