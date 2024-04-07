package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2*3 2차원 배열 생성
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        }; //행2, 열3

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
