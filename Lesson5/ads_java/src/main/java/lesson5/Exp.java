package lesson5;

public class Exp {
//    i - возводимое число, n - степень
    public static int Exp(int i, int n) {
        if (n == 0) {
            return 1;
        }
        return i * Exp(i, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Exp(2, 5));
    }
}
