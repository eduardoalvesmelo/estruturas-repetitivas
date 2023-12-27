import java.util.Locale;
import java.util.Scanner;

public class Crestente {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b) {

            if (a > b) {
                System.out.println("DECRESCENTE!");
            } else {
                System.out.println("CRESCENTE!");
            }

            System.out.println("Digite outros dois numeros:");
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
