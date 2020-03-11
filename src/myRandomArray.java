import java.util.Arrays;

public class myRandomArray {
//    задание 3
    public static void main(String[] args) {
        double[] someArr = new double[7];
        double sum1 = 0;
        double srArifm = 0;
        for (int i = 0; i < someArr.length; i++) {
            someArr[i] = Math.random();
            sum1 = sum1 + someArr[i];
        }
        srArifm = sum1 / 7;
        Arrays.sort(someArr);
        System.out.println(Arrays.toString(someArr));
        System.out.printf("Сумма членов массива равна %.4f", sum1);
        System.out.println();
        System.out.printf("Минимальный член массива равен %.4f", someArr[0]);
        System.out.println();
        System.out.printf("Максимальный член массива равен %.4f", someArr[6]);
        System.out.println();
        System.out.printf("Среднее значение массива равно %.4f", srArifm);

    }
}
