import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
//        задание 2
        int a = 0; // ячейка под член массива
        int b = 0; // ячейка под член массива
        int sum = 7;
        int[] someArr = {2, 1, 2, 5, 6}; // задал массив

            for (int i = 0; i < someArr.length; i++) {
                for (int j = 0; j < someArr.length; j++) {
                    if (i != j) {
                        if (sum == someArr[i] + someArr[j]) {
                            a = someArr[i];
                            b = someArr[j];
                            System.out.println("Члены массива равны  " + a + b);
                        }
                    }
                }

            }
        System.out.println(Arrays.toString(someArr));

    }
}
