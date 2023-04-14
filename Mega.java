import java.util.*;
import java.lang.Math;

public class Mega {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        System.out.println("Informe a quantidade de megas");
        x = input.nextInt();
        if (x < 100) {
            System.out.println("O valor a ser pago e de R$40,00");
        } else {
            x = (x - 100) * 2 + 40;
            System.out.println("O valor a ser pago é R$ " + x + ",00");
        }
    }
}
