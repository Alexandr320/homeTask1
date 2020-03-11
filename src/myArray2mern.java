import java.util.Arrays;

public class myArray2mern {
    public static void main(String[] args) {
//        задание 5
        int[][] someArr = new int[5][8];
        int maxValue = -99;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                someArr[i][j] = (int) ((Math.random() * 200) - 100);
                if (maxValue <= someArr[i][j]) {
                    maxValue = someArr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(someArr));
        System.out.println("Макс. значение массива  " + maxValue);
    }
}
