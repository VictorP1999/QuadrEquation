package programm;

import quadrEquation.QuadrSolve;
import java.util.Scanner;

/**
 * Created by Victor Penkin on 22.06.2016.
 */

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите а=");

            int a = scanner.nextInt();

            System.out.print("Введите b=");
            int b = scanner.nextInt();

            System.out.print("Введите c=");
            int c = scanner.nextInt();

            QuadrSolve.QuadrSolve(a, b, c);
        }
    }
}
