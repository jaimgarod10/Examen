package factorial;

public class Factorial {

    public static void main(String[] args) {

        int a;
        int b;

        a = 8;

        int i;
        if (a == 0) {
            b = 1;
        } else {
            b = 1;
            for (i = a; i >= 1; i--) {
                b = b * i;
            }
        }

        System.out.println(b);

    }

}
