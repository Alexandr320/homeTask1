import java.util.Arrays;
import java.util.Scanner;

public class myArray3 {
    public static void main(String[] args) {
//        задание 4
        int c = 0;
        int h = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число больше 3");
        while (true) {
            int n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Введите целое число больше 3");
            } else {
                System.out.printf("Вы ввели %d\n", n);
                int[] someArr = new int[n];
                for (int i = 0; i < n; i++) {
                    int k = (int) (Math.random() * (n + 1));
                    someArr[i] = k;
                    if (someArr[i] % 2 ==0) {
                        c = c +1;
                    }
                }
                int[] someArr1 = new int[c];
                for (int j = 0; j < n; j++) {
                    if (someArr[j] % 2 ==0) {
                        someArr1[h] = someArr[j];
                        h = h +1;
                    }
                }
                System.out.println(Arrays.toString(someArr)); //вывод полученного массива
                System.out.println(c); // количество четных членов
                System.out.println(Arrays.toString(someArr1)); // массив из четных членов первого массива
                break;

            }

        }
    }
}
