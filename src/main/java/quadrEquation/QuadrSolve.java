package quadrEquation;

/**
 * Created by Victor Penkin on 22.06.2016.
 */

public class QuadrSolve {
    public static void QuadrSolve(int a, int b, int c) {
        if (a == 0) {
            String str8 = "Линейное уравнение.";
            System.out.println(str8);
            double x = ((-1 * c) / b);
            String str9 = "x=";
            System.out.print(str9);
            System.out.println(x);
        }
        else {
            String str3 = "D=";
            System.out.print(str3);
            double DD = (b * b - 4 * a * c);
            System.out.println(DD);

            if (DD >= 0) {
                double D = Math.sqrt(b * b - 4 * a * c);
                double x = ((-1 * b + D) / 2 * a);
                String str4 = "x1=";

                System.out.print(str4);
                System.out.println(x);

                double xx = ((-1 * b - D) / 2 * a);
                if (x != xx) {
                    String str5 = "x2=";
                    System.out.print(str5);
                    System.out.println(xx);
                } else {
                    String str6 = "Уравнение имеет один корень.";
                    System.out.print(str6);
                }
            } else {
                String str7 = "Уравнение не имеет корней.\n";
                System.out.print(str7);
            }

        }
    }
}
