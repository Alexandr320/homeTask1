public class nod {
    public static void main(String[] args) {
//        задание 1
        int a = 150;
        int b = 80;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println(a + b);

    }
}
