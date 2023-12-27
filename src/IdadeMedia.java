import java.util.Locale;
import java.util.Scanner;

public class IdadeMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double cont = 0;
        double media = 0.0;

        System.out.println("Digite as idades:");
        int a = sc.nextInt();

        if (a < 0){
            System.out.println("IMPOSSIVEL CALCULAR");
        }
        else {
            while ( a > 0) {
                soma += a;
                cont += 1;
                a = sc.nextInt();
            }
            media = soma/cont;
            System.out.printf("MEDIA = %.2f",media);
        }

    }
}
